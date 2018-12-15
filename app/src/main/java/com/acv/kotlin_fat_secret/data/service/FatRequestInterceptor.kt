package com.acv.kotlin_fat_secret.data.service

import android.net.Uri
import android.util.Base64
import android.util.Log
import okhttp3.Interceptor
import okhttp3.Response
import java.security.InvalidKeyException
import java.security.NoSuchAlgorithmException
import java.util.*
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec


class FatRequestInterceptor(val apiKey: String, val cacheDuration: Int) : Interceptor {

    private val APP_SECRET = "a973a97be2e343f7a6a472bd964932ec&"
    private val APP_URL = "http://platform.fatsecret.com/rest/server.api"

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()

        val unixTime = System.currentTimeMillis() / 1000L
        val nonce = System.currentTimeMillis().toString()

        var url = request.url().newBuilder()
                .addQueryParameter("format", "json")
                .addQueryParameter("oauth_consumer_key", apiKey)
                .addQueryParameter("oauth_nonce", nonce)
                .addQueryParameter("oauth_signature_method", "HMAC-SHA1")
                .addQueryParameter("oauth_timestamp", unixTime.toString())
                .addQueryParameter("oauth_version", "1.0")

        var build = url.build()
        val split = build.query().split("&").toTypedArray()
        build = url.query(paramify(split)).build()

        val base = request.method() + "&" + Uri.encode(APP_URL) + "&" + Uri.encode(build.query())

        val calc = sign(base)

        build = request.url().newBuilder()
                .query(paramify(split))
                .addQueryParameter("oauth_signature", calc)
                .build()

        val newRequest = request.newBuilder()
                .url(build)
                .build()

        return chain.proceed(newRequest)
    }

    private fun sign(method: String): String? {
        try {
            val signingKey = SecretKeySpec(APP_SECRET.toByteArray(), "HmacSHA1")
            val mac = Mac.getInstance("HmacSHA1")
            mac.init(signingKey)
            return String(Base64.encode(mac.doFinal(method.toByteArray()), Base64.DEFAULT)).trim()
        } catch (e: NoSuchAlgorithmException) {
            Log.w("FatSecret_TEST FAIL", e.message)
            return null
        } catch (e: InvalidKeyException) {
            Log.w("FatSecret_TEST FAIL", e.message)
            return null
        }
    }

    private fun paramify(params: Array<String>): String {
        val p = Arrays.copyOf(params, params.size)
        Arrays.sort(p)
        return join(p, "&")
    }

    private fun join(array: Array<String>, separator: String): String {
        val b = StringBuilder()
        for (i in array.indices) {
            if (i > 0)
                b.append(separator)
            b.append(array[i])
        }
        return b.toString()
    }
}
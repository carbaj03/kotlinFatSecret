package com.acv.kotlin_fat_secret.infraestructure.ui.login

import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.acv.kotlin_fat_secret.R
import com.acv.kotlin_fat_secret.infraestructure.ui.main.weight.adapter.WeightAdapter
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class LoginFragmentUI() : AnkoComponent<Fragment> {
    override fun createView(ui: AnkoContext<Fragment>): View {
        return with(ui) {
            linearLayout {
                lparams(width = matchParent, height = matchParent)

                button {
                    id = R.id.btnLogin
                    text = ctx.getString(R.string.btnLogin)
                }
            }
        }
    }
}


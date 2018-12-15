package com.acv.kotlin_fat_secret.infraestructure.ui.splash

import android.app.Activity
import android.view.View
import com.acv.kotlin_fat_secret.R
import org.jetbrains.anko.*

class SplashActivityUI : AnkoComponent<Activity> {
    override fun createView(ui: AnkoContext<Activity>): View {
        return with(ui) {
            verticalLayout {
                id = R.id.appbar

                imageView {
                    imageResource = R.drawable.ic_android_black_24dp
                }
            }
        }
    }
}
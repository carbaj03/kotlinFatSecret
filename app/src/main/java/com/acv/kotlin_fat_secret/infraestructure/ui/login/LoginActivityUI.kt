package com.acv.kotlin_fat_secret.infraestructure.ui.login

import android.app.Activity
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.support.v4.content.ContextCompat
import android.view.View
import com.acv.kotlin_fat_secret.R
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.design.appBarLayout

class LoginActivityUI : AnkoComponent<Activity> {
    override fun createView(ui: AnkoContext<Activity>): View {
        return with(ui) {
            verticalLayout {
                appBarLayout {
                    id = R.id.appbar
                    backgroundColor = ContextCompat.getColor(ctx, R.color.accent)

                    toolbar {
                        id = R.id.toolbar
                        setTitleTextColor(Color.WHITE)
                        overflowIcon!!.colorFilter = PorterDuffColorFilter(Color.WHITE, PorterDuff.Mode.MULTIPLY)
                    }
                }

                frameLayout {
                    id = R.id.container
                }
            }
        }
    }
}
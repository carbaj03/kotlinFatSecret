package com.acv.kotlin_fat_secret.infraestructure.ui.main.profile

import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.view.View
import com.acv.kotlin_fat_secret.R
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.design.appBarLayout


class ProfileFragmentUI : AnkoComponent<Fragment>{
    override fun createView(ui: AnkoContext<Fragment>): View {
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

                textView {
                    id = R.id.tv_profile
                }
            }
        }
    }

}
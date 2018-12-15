package com.acv.kotlin_fat_secret.infraestructure.ui.main.food.diary

import android.graphics.Color
import android.support.v4.app.Fragment
import android.view.View
import android.view.View.GONE
import android.support.design.widget.AppBarLayout
import android.support.design.widget.AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS
import android.support.design.widget.AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL
import com.acv.kotlin_fat_secret.R
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.support.v4.nestedScrollView

class DiaryFragmentUI() : AnkoComponent<Fragment> {
    override fun createView(ui: AnkoContext<Fragment>): View {
        return with(ui) {
            coordinatorLayout {
                lparams(width = matchParent)

                appBarLayout {
                    lparams(width = matchParent)
                    id = R.id.appbar2
                    toolbar {
                        id = R.id.toolbar
                        setTitleTextColor(Color.WHITE)
                    }.lparams {
                        scrollFlags = SCROLL_FLAG_SCROLL or SCROLL_FLAG_ENTER_ALWAYS
                    }

                    calendarView {
                        id = R.id.cv_diary
                        visibility = GONE
                    }
                }

                imageView {
                    imageResource = R.drawable.ic_add_white_24px
                }.lparams {
                    behavior = AppBarLayout.ScrollingViewBehavior()
                }

                nestedScrollView {
                    verticalLayout {
                        textView {
                            id = R.id.tv_calories
                            text = "1000/2000"
                        }

                    }
                }.lparams {
                    behavior = AppBarLayout.ScrollingViewBehavior()
                }
            }
        }
    }
}


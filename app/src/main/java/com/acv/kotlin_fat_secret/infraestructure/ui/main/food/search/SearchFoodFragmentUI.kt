package com.acv.kotlin_fat_secret.infraestructure.ui.main.food.search

import android.graphics.Color
import android.support.design.widget.AppBarLayout
import android.support.design.widget.AppBarLayout.LayoutParams.*
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.acv.kotlin_fat_secret.R
import com.acv.kotlin_fat_secret.infraestructure.ui.main.food.search.adapter.SearchFoodAdapter
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.support.v4.swipeRefreshLayout

class SearchFoodFragmentUI(val listAdapter: SearchFoodAdapter) : AnkoComponent<Fragment> {
    override fun createView(ui: AnkoContext<Fragment>): View {
        return with(ui) {
            coordinatorLayout {
                lparams(width = matchParent)

                appBarLayout {
                    lparams(width = matchParent)
                    id = R.id.appbar
                    toolbar {
                        id = R.id.toolbar
                        setTitleTextColor(Color.WHITE)
                    }.lparams {
                        scrollFlags = SCROLL_FLAG_SCROLL or SCROLL_FLAG_ENTER_ALWAYS or SCROLL_FLAG_SNAP
                    }
                }

                swipeRefreshLayout {
                    id = R.id.swipe_refresh
                    recyclerView {
                        id = R.id.rv_foods
                        layoutManager = LinearLayoutManager(ctx)
                        adapter = listAdapter
                    }
                }.lparams {
                    behavior = AppBarLayout.ScrollingViewBehavior()
                }

            }
        }
    }
}


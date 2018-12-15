package com.acv.kotlin_fat_secret.infraestructure.ui.main

import android.support.design.widget.BottomNavigationView
import android.support.v7.widget.Toolbar
import com.acv.kotlin_fat_secret.R
import com.acv.kotlin_fat_secret.infraestructure.di.ApplicationComponent
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.main.MainActivityModule
import com.acv.kotlin_fat_secret.infraestructure.ui.common.BaseActivity
import com.acv.kotlin_fat_secret.infraestructure.ui.extension.replace
import com.acv.kotlin_fat_secret.infraestructure.ui.main.food.diary.DiaryFragment
import com.acv.kotlin_fat_secret.infraestructure.ui.main.food.search.SearchFoodFragment
import com.acv.kotlin_fat_secret.infraestructure.ui.main.profile.ProfileFragment
import com.acv.kotlin_fat_secret.infraestructure.ui.main.weight.WeightMonthFragment
import org.jetbrains.anko.find

class MainActivity : BaseActivity() {

    val bottomNavigation by lazy { find<BottomNavigationView>(R.id.bottom_navigation) }
    val toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun injectDependencies(applicationComponent: ApplicationComponent)
            = applicationComponent.plus(MainActivityModule(this)).injectTo(this)

    override fun initView() {
        setContentView(R.layout.main)
        initBottonNavigation()
        replace(SearchFoodFragment.newInstance())
    }

    private fun initBottonNavigation() {
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.getItemId()) {
                R.id.action_favorites -> {
                    replace(SearchFoodFragment.newInstance())
                }
                R.id.action_schedules -> {
                    replace(WeightMonthFragment.newInstance())
                }
                R.id.action_user -> {
                    replace(ProfileFragment.newInstance())
                }
            }
            false
        }
    }
}

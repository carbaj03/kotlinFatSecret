package com.acv.kotlin_fat_secret.infraestructure.ui.main.food.diary

import android.os.Bundle
import android.support.annotation.VisibleForTesting
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.acv.kotlin_fat_secret.infraestructure.di.ApplicationComponent
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.diary.DiaryFragmentModule
import com.acv.kotlin_fat_secret.infraestructure.ui.common.BaseFragment
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.support.v4.ctx
import java.util.*
import javax.inject.Inject

class DiaryFragment : BaseFragment(), DiaryView {

    companion object {
        fun newInstance(): DiaryFragment = DiaryFragment()
    }

    @Inject @VisibleForTesting
    lateinit var presenter: DiaryPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.init(Date())
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?)
            : View? = DiaryFragmentUI().createView(AnkoContext.create(ctx, this))

    override fun injectDependencies(applicationComponent: ApplicationComponent)
            = applicationComponent.plus(DiaryFragmentModule(this)).injectTo(this)
}



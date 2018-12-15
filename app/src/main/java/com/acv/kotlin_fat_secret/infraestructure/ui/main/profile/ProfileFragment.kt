package com.acv.kotlin_fat_secret.infraestructure.ui.main.profile

import android.os.Bundle
import android.support.annotation.VisibleForTesting
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.acv.kotlin_fat_secret.R
import com.acv.kotlin_fat_secret.domain.Profile
import com.acv.kotlin_fat_secret.infraestructure.di.ApplicationComponent
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.profile.ProfileFragmentModule
import com.acv.kotlin_fat_secret.infraestructure.ui.common.BaseFragment
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.support.v4.ctx
import org.jetbrains.anko.support.v4.find
import javax.inject.Inject

class ProfileFragment : BaseFragment(), ProfileView {

    val tvProfile by lazy { find<TextView>(R.id.tv_profile) }

    @Inject @VisibleForTesting
    lateinit var presenter: ProfilePresenter

    companion object {
        fun newInstance(): ProfileFragment = ProfileFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.loadProfile()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?)
            : View? = ProfileFragmentUI().createView(AnkoContext.create(ctx, this))

    override fun injectDependencies(applicationComponent: ApplicationComponent)
            = applicationComponent.plus(ProfileFragmentModule(this)).injectTo(this)

    override fun showProfile(profile: Profile) {
        tvProfile.text = profile.last_weight_commment
    }
}



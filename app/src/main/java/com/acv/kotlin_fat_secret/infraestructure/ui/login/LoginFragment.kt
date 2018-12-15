package com.acv.kotlin_fat_secret.infraestructure.ui.login

import android.os.Bundle
import android.support.annotation.VisibleForTesting
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.acv.kotlin_fat_secret.R
import com.acv.kotlin_fat_secret.infraestructure.di.ApplicationComponent
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.login.LoginFragmentModule
import com.acv.kotlin_fat_secret.infraestructure.ui.common.BaseFragment
import com.acv.kotlin_fat_secret.infraestructure.ui.main.MainActivity
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.support.v4.ctx
import javax.inject.Inject
import com.acv.kotlin_fat_secret.infraestructure.ui.extension.launch
import org.jetbrains.anko.support.v4.find

class LoginFragment : BaseFragment(), LoginView {

    companion object {
        fun newInstance(): LoginFragment = LoginFragment()
    }

    val btnLogin by lazy { find<TextView>(R.id.btnLogin) }

    @Inject @VisibleForTesting
    lateinit var presenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.init()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return LoginFragmentUI().createView(AnkoContext.create(ctx, this))
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        btnLogin.setOnClickListener { presenter. }
    }

    override fun injectDependencies(applicationComponent: ApplicationComponent) {
        applicationComponent.plus(LoginFragmentModule(this))
                .injectTo(this)
    }

    override fun goToMain() {
        launch<MainActivity>()
    }
}



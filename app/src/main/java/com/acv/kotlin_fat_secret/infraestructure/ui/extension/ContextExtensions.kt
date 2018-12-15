package com.acv.kotlin_fat_secret.infraestructure.ui.extension

import android.app.Activity
import android.content.Intent
import android.support.v4.app.ActivityCompat
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.view.View
import com.acv.kotlin_fat_secret.R
import com.acv.kotlin_fat_secret.infraestructure.ui.common.BaseFragment

inline fun <reified T : Activity> Activity.navigate(id: String,
                                                    sharedView: View? = null,
                                                    transitionName: String? = null) {
    val intent = Intent(this, T::class.java)
    intent.putExtra("id", id)

    var options: ActivityOptionsCompat? = null

    if (sharedView != null && transitionName != null) {
        options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, sharedView, transitionName)
    }
    ActivityCompat.startActivity(this, intent, options?.toBundle())

}

inline fun <reified T : Activity> Activity.navigate() {
    val intent = Intent(this, T::class.java)
    ActivityCompat.startActivity(this, intent, null)
}

inline fun <reified T : Activity> Activity.launch() {
    val intent = Intent(this, T::class.java)
    ActivityCompat.startActivity(this, intent, null)
}

inline fun <reified T : Activity> Fragment.launch() {
    val intent = Intent(this.activity, T::class.java)
    ActivityCompat.startActivity(this.activity, intent, null)
}


fun FragmentActivity.replace(fragment: BaseFragment, id : Int = R.id.container){
    supportFragmentManager.beginTransaction().replace(id, fragment).commit()
}
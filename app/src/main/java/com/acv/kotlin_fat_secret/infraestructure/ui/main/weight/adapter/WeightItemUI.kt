package com.acv.kotlin_fat_secret.infraestructure.ui.main.weight.adapter

import android.graphics.Typeface
import android.text.TextUtils
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.acv.kotlin_fat_secret.R
import org.jetbrains.anko.*

class WeightItemUI : AnkoComponent<ViewGroup> {
    override fun createView(ui: AnkoContext<ViewGroup>): View {
        return with(ui) {

            linearLayout {
                lparams(width = matchParent, height = wrapContent)
                orientation = LinearLayout.VERTICAL
                horizontalPadding = dip(16)
                padding = dip(8)

                textView {
                    lparams {
                        gravity = Gravity.CENTER_VERTICAL
                        weight = 1.0f
                    }
                    id = R.id.tvName
                    singleLine = true
                    ellipsize = TextUtils.TruncateAt.END
                    textSize = 16f
                }.setTypeface(null, Typeface.BOLD)

                textView {
                    lparams {
                        gravity = Gravity.CENTER_VERTICAL
                        weight = 1.0f
                    }
                    id = R.id.tvDescription
                    singleLine = true
                    ellipsize = TextUtils.TruncateAt.END
                    textSize = 14f
                }
            }
        }
    }
}
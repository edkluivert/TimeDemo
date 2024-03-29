package com.hybrid.timedemo.helpers

import android.widget.TextView
import com.simplemobiletools.commons.extensions.applyColorFilter

fun TextView.colorLeftDrawable(color: Int) {
    val leftImage = compoundDrawables.first()
    leftImage.applyColorFilter(color)
    setCompoundDrawables(leftImage, null, null, null)
}

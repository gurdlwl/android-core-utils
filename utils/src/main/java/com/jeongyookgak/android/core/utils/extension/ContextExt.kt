package com.jeongyookgak.android.core.utils.extension

import android.content.Context
import android.widget.Toast
import com.jeongyookgak.android.core.utils.extension.ContextExt.TOAST_SHORT

object ContextExt {
    const val TOAST_SHORT = Toast.LENGTH_SHORT
    const val TOAST_LONG = Toast.LENGTH_LONG
}

fun Context.showToast(message: String, duration: Int = TOAST_SHORT) {
    Toast.makeText(this, message, duration).show()
}

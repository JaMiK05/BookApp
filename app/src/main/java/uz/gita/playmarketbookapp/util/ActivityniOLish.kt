package uz.gita.playmarketbookapp.util

import android.app.Activity
import android.content.Context

/**
 *   Created by Jamik on 6/29/2023 ot 1:10 AM
 **/

fun getCurrentActivity(context: Context): Activity? {
    var currentActivity: Activity? = null
    if (context is Activity) {
        currentActivity = context
    } else if (context is android.content.ContextWrapper) {
        currentActivity = getCurrentActivity(context.baseContext)
    }
    return currentActivity
}
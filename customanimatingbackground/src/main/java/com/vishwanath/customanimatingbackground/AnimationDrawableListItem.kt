package com.vishwanath.customanimatingbackground

import android.graphics.drawable.GradientDrawable
import android.view.View

data class AnimationDrawableListItem(
    var view: View,
    var orientation: GradientDrawable.Orientation,
    var startColor: String,
    var midColor: String,
    var endColor: String,
    var cornerRadius: Float

)
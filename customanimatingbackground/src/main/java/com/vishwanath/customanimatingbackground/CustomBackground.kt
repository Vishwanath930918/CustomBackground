package com.vishwanath.customanimatingbackground

import android.graphics.Color
import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.view.View

object CustomBackground {
    var anim: AnimationDrawable? = null
    var views: View? = null
    var animationDrawable: AnimationDrawable = AnimationDrawable()
    fun initialize(view: View?) {
        initializeEmptyBackground(view, animationDrawable)
        anim = view?.background as AnimationDrawable?
        views = view
        anim?.isOneShot = false
    }

    fun setAnimationList(drawableList: ArrayList<Drawable>, duration: Int): Unit {
        for (drawable in drawableList) {
            addFrameToAnimate(drawable, duration)
        }
    }

    fun initializeEmptyBackground(view: View?, drawable: AnimationDrawable) {
        view?.background = drawable
    }

    fun addFrameToAnimate(frame: Drawable, duration: Int) {
        anim?.addFrame(frame, duration)
    }

    fun setAnimation(view: View?, enterTransDuration: Int) {
        view?.apply {
            anim = background as AnimationDrawable?
            post(Animator(anim, enterTransDuration))
        }
    }

    fun setGradientViewFor(
        view: View,
        orientation: GradientDrawable.Orientation?,
        startColor: String?,
        middleColor: String?,
        endColor: String?,
        cornerRadius: Float
    ): Drawable {
        val colors =
            intArrayOf(
                Color.parseColor(startColor),
                Color.parseColor(middleColor),
                Color.parseColor(endColor)
            )
        val gd = GradientDrawable(orientation, colors)
        gd.cornerRadius = cornerRadius
        return gd
    }

    class Animator(animationDrawable: AnimationDrawable?, duration: Int) : Runnable {
        var anim: AnimationDrawable? = animationDrawable
        var duration: Int = duration
        override fun run() {
            anim?.setEnterFadeDuration(duration)
            anim?.setExitFadeDuration(duration * 2)
            anim?.start()
        }

    }
}
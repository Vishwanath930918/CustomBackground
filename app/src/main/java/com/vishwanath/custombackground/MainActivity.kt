package com.vishwanath.custombackground

import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vishwanath.customanimatingbackground.CustomBackground
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CustomBackground.initialize(main)
        var animationDrawableList = arrayListOf<Drawable>()
        //CustomBackground.setAnimation(main, animationDrawableList)

        /* var animList = AnimationDrawableListItem(
             main,
             GradientDrawable.Orientation.BOTTOM_TOP,
             "#D81B60",
             "#00574B",
             "#008577",
             0.0f
         )*/

        var viewDrawable1 = CustomBackground.setGradientViewFor(
            main,
            GradientDrawable.Orientation.RIGHT_LEFT,
            "#839e2e",
            "#a4c639",
            "#808000",
            0.0f
        )
        var viewDrawable2 = CustomBackground.setGradientViewFor(
            main,
            GradientDrawable.Orientation.BOTTOM_TOP,
            "#808000",
            "#a4c639",
            "#839e2e",
            0.0f
        )
        var viewDrawable3 = CustomBackground.setGradientViewFor(
            main,
            GradientDrawable.Orientation.LEFT_RIGHT,
            "#839e2e",
            "#a4c639",
            "#808000",
            0.0f
        )
        var viewDrawable4 = CustomBackground.setGradientViewFor(
            main,
            GradientDrawable.Orientation.TOP_BOTTOM,
            "#808000",
            "#a4c639",
            "#839e2e",
            0.0f
        )
        //animationDrawableList.add(viewDrawable1)
        //animationDrawableList.add(viewDrawable2)
//        getDrawable(R.drawable.dr_two)?.let { animationDrawableList.add(it) }
//        getDrawable(R.drawable.dr_one)?.let { animationDrawableList.add(it) }
//        getDrawable(R.drawable.dr_three)?.let { animationDrawableList.add(it) }
//        getDrawable(R.drawable.dr_four)?.let { animationDrawableList.add(it) }
//        //animationDrawableList.add(viewDrawable4)
//        CustomBackground.setAnimationList(animationDrawableList, 5000)
//        CustomBackground.setAnimation(main, 2500)
        main.background = viewDrawable1

        //CustomBackground.setAnimation(text, 1000)
    }
}

package com.stematel.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        Handler().postDelayed({
            val item = findViewById<ImageButton>(R.id.imageButton5)
            item.startAnimation(
                AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.ttb,
            ))
        }, 0)
        Handler().postDelayed({
            val item = findViewById<ImageButton>(R.id.imageButton6)
            item.startAnimation(
                AnimationUtils.loadAnimation(
                    applicationContext,
                    R.anim.ttb,
                ))
        }, 0)
        Handler().postDelayed({
            val item = findViewById<ImageButton>(R.id.imageButton4)
            item.startAnimation(
                AnimationUtils.loadAnimation(
                    applicationContext,
                    R.anim.tta,
                ))
        }, 0)
        Handler().postDelayed({
            val item = findViewById<ImageButton>(R.id.imageButton7)
            item.startAnimation(
                AnimationUtils.loadAnimation(
                    applicationContext,
                    R.anim.tta,
                ))
        }, 0)

        val tombol1 = findViewById<ImageButton>(R.id.imageButton5)
        val tombol2 = findViewById<ImageButton>(R.id.imageButton4)
        val tombol3 = findViewById<ImageButton>(R.id.imageButton6)
        val tombol4 = findViewById<ImageButton>(R.id.imageButton7)

        tombol1.setOnClickListener {
            Intent(this@HomeActivity,Detail1Activity::class.java).also {
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
                startActivity(it)}
        }
        tombol2.setOnClickListener {
            Intent(this@HomeActivity,Detail1Activity::class.java).also {
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
                startActivity(it)}
        }
        tombol3.setOnClickListener {
            Intent(this@HomeActivity,Detail1Activity::class.java).also {
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
                startActivity(it)}
        }
        tombol4.setOnClickListener {
            Intent(this@HomeActivity,Detail1Activity::class.java).also {
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
                startActivity(it)}
        }
    }
}
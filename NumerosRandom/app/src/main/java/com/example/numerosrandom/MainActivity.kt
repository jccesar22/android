package com.example.numerosrandom

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       if(supportActionBar != null){
           supportActionBar!!.hide()
       }



        buttonRandom.setOnClickListener(this)
        textNumber.setOnClickListener(this)

    }
    override fun onClick(v: View?) {
        if(v?.id == R.id.buttonRandom || v?.id == R.id.textNumber){
           textNumber.text = random().toString()
        }
    }
    fun random(): Int{
       return Random.nextInt(50) + 1
    }
}
/*plugins {
    id 'com.android.application'
    id 'kotlin-android'
    id 'kotlin-android-extensions'
}
se der erro de coloca o
import kotlinx.android.synthetic.main.activity_main.*
colocar no build.gradle
*/
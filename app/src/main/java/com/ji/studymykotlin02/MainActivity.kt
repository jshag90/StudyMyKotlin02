package com.ji.studymykotlin02

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myName:String = "메시"
        var number:Int? = null //1. nullable
        var newVariable: Activity? = null

        Log.d("Null Test", "문자열의 길이는=${myName.length}")

        var number2:Int = 30

        // var result = number2.plus(50)

        // Null Pointer Exception
        var result = number?.plus(37) ?: 51 // 2. Safe Call 3. Elvis Expression
        var result2 = result.plus(53)

    }
}
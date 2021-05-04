package com.enigmacamp.andoridbasickotlinvicapremium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MAINACTIVITY","OnCreacte")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MAINACTIVITY","OnStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MAINACTIVITY","OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MAINACTIVITY","OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MAINACTIVITY","OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MAINACTIVITY","OnDestroy")
    }
}
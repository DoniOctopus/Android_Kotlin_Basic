package com.enigmacamp.andoridbasickotlinvicapremium

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun letsPlay(view: View) {
        val intent = Intent(this,BoardActivity::class.java)
        startActivity(intent)
    }


}
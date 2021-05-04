package com.enigmacamp.andoridbasickotlinvicapremium

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var userNameText : TextInputEditText

    //companion object adalah object yang constant agar kita bisa pakai dimana saja
    companion object{
        const val USER_NAME = "USER_NAME"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MAINACTIVITY","OnCreate")
        userNameText = findViewById(R.id.username_text_input)
    }

    fun movetoSecondActivity(view: View) {
        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra(USER_NAME,userNameText.text.toString())
        //staractivity untuk melakukan atau membuat activity baru
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.i("MAINACTIVITY","OnStart")
    }

    override fun onResume() {
        super.onResume()
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

    override fun onRestart() {
        super.onRestart()
        Log.i("MAINACTIVITY","OnRestart")

    }
}
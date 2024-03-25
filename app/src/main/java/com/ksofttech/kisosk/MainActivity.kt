package com.ksofttech.kisosk


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    lateinit var recyclerview: RecyclerView;
    lateinit var setting_Floating: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("Response=>", "Chirag")

        recyclerview = findViewById(R.id.recyclerview)
        setting_Floating = findViewById(R.id.settingFloatingFab)


        // on below line we are adding on click listener
        // for our add floating action button
        setting_Floating.setOnClickListener {
            openSettings()
        }

    }

    private fun openSettings() {

        val intent = Intent(this, SettingActivity::class.java)
        startActivity(intent)
    }
}
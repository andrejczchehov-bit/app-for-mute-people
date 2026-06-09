package com.example.myapplicatiocalculyator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class activity_lock_default : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lock_default)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        // кнопка "назад" в главное меню
        toolbar.setNavigationOnClickListener {
            finish()
            setSupportActionBar(toolbar)


        }
    }
}
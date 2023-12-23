package com.example.netclanexplorerprject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val individual=findViewById<CardView>(R.id.cardView1)

        individual.setOnClickListener {
            moveToIndividualimage()
        }

    }

    private fun moveToIndividualimage() {
        val intent=Intent(this,ExploreActivity::class.java)
        startActivity(intent)
    }    }



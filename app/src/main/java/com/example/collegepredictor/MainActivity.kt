package com.example.collegepredictor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {
    lateinit var aktu_btech:LinearLayout
    lateinit var aktu_cuet: LinearLayout
    lateinit var hbtu_btech:LinearLayout
    lateinit var about_us: RelativeLayout
    lateinit var mentor_guide_chat:LinearLayout
    lateinit var jee_main_btech:LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        aktu_btech = findViewById(R.id.aktu_btech)
        aktu_cuet= findViewById(R.id.aktu_cuet)
        hbtu_btech= findViewById(R.id.hbtu_btech)
        about_us = findViewById(R.id.about_us)
        mentor_guide_chat = findViewById(R.id.mentor_guide_chat)
        jee_main_btech = findViewById(R.id.jee_main_btech)


        mentor_guide_chat.setOnClickListener {
            val intent = Intent(this,ChatActivity::class.java)
            startActivity(intent)
        }

        aktu_btech.setOnClickListener {
            val intent = Intent(this, SelectRankActivity::class.java)
            intent.putExtra("key", "aktu_btech.json")
            startActivity(intent)
        }
        aktu_cuet.setOnClickListener {
            val intent = Intent(this,SelectRankActivity::class.java)
            intent.putExtra("key", "aktu_cuet.json")
            startActivity(intent)
        }

        hbtu_btech.setOnClickListener {
            val intent = Intent(this,SelectRankActivity::class.java)
            intent.putExtra("key","hbtu_btech.json")
            startActivity(intent)
        }
        jee_main_btech.setOnClickListener {
            val intent = Intent(this, SelectRankActivity::class.java)
            intent.putExtra("key", "jee_main.json")
            startActivity(intent)
        }
    }
}
package com.osu.euklicenka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1:Button=findViewById(R.id.button1)

        var button2:Button=findViewById(R.id.button2)
        var button3:Button=findViewById(R.id.button3)



        button1.setOnClickListener { v: View? ->
            var intent = Intent(this, Destinations::class.java )
            startActivity(intent)
            finish()
        }

        button2.setOnClickListener { v: View? ->
            var intent = Intent(this, MapsActivity::class.java )
            startActivity(intent)
            finish()
        }



    }
}
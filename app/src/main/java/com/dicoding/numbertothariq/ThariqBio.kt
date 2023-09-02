package com.dicoding.numbertothariq

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ThariqBio : AppCompatActivity() {
    companion object{
        const val EXTRA_THARIQ = "extra_thariq"

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thariq_bio)

        val bioThariq: TextView = findViewById(R.id.bioTHariq)


        val thariq = if (Build.VERSION.SDK_INT >= 33){
        intent.getParcelableExtra<Thariq>(EXTRA_THARIQ, Thariq::class.java)


        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra<Thariq>(EXTRA_THARIQ)
        }

        if (thariq != null) {
            val text = "Name : ${thariq.name.toString()},\nAge : ${thariq.age},\nPower : ${thariq.power}"
            bioThariq.text = text





        }

    }
}
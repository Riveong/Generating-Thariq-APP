package com.dicoding.numbertothariq

import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ThariqBio : AppCompatActivity(), View.OnClickListener {
    companion object{
        const val EXTRA_THARIQ = "extra_thariq"

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thariq_bio)

        val bioThariq: TextView = findViewById(R.id.bioTHariq)
        val order: Button = findViewById(R.id.Order)

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



        order.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when (v?.id){
        R.id.Order -> {
            val phoneNumber = "69420"
            val dial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dial)


        }



        }
    }
}
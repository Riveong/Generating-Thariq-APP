package com.dicoding.numbertothariq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    private lateinit var BackRiq: Button
    private lateinit var TypeRiq: Button
    private lateinit var ThariqCult: TextView
    private lateinit var ThariqBiotton: Button


    companion object {
       const val THARIQBANYAK = ""
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        BackRiq = findViewById(R.id.backRiq)
        TypeRiq = findViewById(R.id.typeRiq)
        ThariqCult = findViewById(R.id.thariqCult)
        ThariqBiotton = findViewById(R.id.parcelable)

        BackRiq.setOnClickListener(this)
        TypeRiq.setOnClickListener(this)
        ThariqBiotton.setOnClickListener(this)

        val thariqbanyak = intent.getStringExtra(THARIQBANYAK)
        var thatBigText = "Thariq has $thariqbanyak now..."



        //if thariq has no ligma
        if (thariqbanyak != null) {
            ThariqCult.text = thatBigText
        }





    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.backRiq -> {
                val moveIntent = Intent(this@MainActivity2, MainActivity::class.java)
                startActivity(moveIntent)
            }


            R.id.typeRiq -> {
                val moveIntent = Intent(this@MainActivity2, MainActivity3::class.java)
                moveIntent.putExtra(MainActivity3.THARIQSYNDROME, "ligmaballs")
                startActivity(moveIntent)
            }

            R.id.parcelable -> {
                val thariq = Thariq(
                    "Thariq the 5th",
                    10,
                    "Mastourbator"

                )

                val moveIntent = Intent(this@MainActivity2, ThariqBio::class.java)
                moveIntent.putExtra(ThariqBio.EXTRA_THARIQ, thariq)
                startActivity(moveIntent)



            }

        }




    }
}
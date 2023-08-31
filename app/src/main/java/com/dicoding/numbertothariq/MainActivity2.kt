package com.dicoding.numbertothariq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    private lateinit var BackRiq: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        BackRiq = findViewById(R.id.backRiq)
        BackRiq.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.backRiq){
            val moveIntent = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(moveIntent)
        }




    }
}
package com.dicoding.numbertothariq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity3 : AppCompatActivity(), View.OnClickListener {
    private lateinit var forgoriq: TextView
    private lateinit var BackButt: Button
    companion object{
        const val THARIQSYNDROME = "thariqSyn"
    }




    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        forgoriq = findViewById(R.id.ThariqCondition)
        BackButt = findViewById(R.id.backButt)
        BackButt.setOnClickListener(this)

        val thariqSyn = intent.getStringExtra(THARIQSYNDROME)


        val text = "thariq has $thariqSyn now...."


        forgoriq.text = text


    }

    override fun onClick(v: View?) {
    when(v?.id){
        R.id.backButt -> {
            val moveIntent = Intent(this@MainActivity3, MainActivity2::class.java)
            moveIntent.putExtra(MainActivity2.THARIQBANYAK, "Ligma")
            startActivity(moveIntent)

        }


    }

    }
}
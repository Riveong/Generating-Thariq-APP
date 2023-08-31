package com.dicoding.numbertothariq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

private lateinit var hasriq: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tomriq: Button  = findViewById(R.id.tombol)
        hasriq= findViewById(R.id.hasil)
        val pinriq: Button = findViewById(R.id.moreThariq)
        tomriq.setOnClickListener(this)
        pinriq.setOnClickListener(this)


    }

    override fun onClick(tomriq: View?) {
        if (tomriq?.id == R.id.tombol){
            var rndm = listOf("Marvelous","Believer","Warrior","Berserk","Gigantus","Biggus","Strong","Buff","Weak","Small","Genshiner","War thunder player","Able", "Bad", "Calm", "Dark", "Eager", "Fast", "Glad", "Hard", "Icy", "Jolly", "Keen", "Large", "Mad", "Nice", "Old", "Pale", "Quick", "Rare", "Sad", "Tall", "Ugly", "Vast", "Warm", "Xeric", "Young", "Zany", "Brave", "Cool", "Dry", "Easy", "Fair", "Good", "Happy", "Idle", "Juicy", "Kind", "Loud", "Neat", "Open", "Pink", "Quiet", "Rich", "Smart", "Thin", "Vain", "Wild", "Yummy", "Zealous", "Bright", "Cute", "Early", "Faint", "Great", "Heavy", "Ironic", "Lazy", "Mean", "Odd", "Plain", "Rough", "Sharp", "Tiny", "Vivid", "Wise", "Xenial", "Yellow", "Zenithal", "Bitter", "Crisp", "Eerie", "Fancy", "Green", "Honest", "Jaded", "Lively", "Mild", "Narrow", "Proud", "Round", "Soft", "Tense", "Vague", "Witty", "X-rayed", "Yawning", "Zippy")
            val randomized = rndm.shuffled()
            val resultmized = randomized.elementAt(0)
            hasriq.text = resultmized.toString()+" Thariq"


        }


        if (tomriq?.id == R.id.moreThariq){
            val moveIntent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(moveIntent)
        }



    }
}
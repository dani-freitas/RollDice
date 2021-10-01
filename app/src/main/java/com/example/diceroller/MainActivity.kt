package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_butoon)
        rollButton.setOnClickListener { rollDice()}

        val contagem: Button = findViewById(R.id.contagem)
        contagem.setOnClickListener { countUp() }


    }

    private fun rollDice(){

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = ""

        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()

    }


    private fun countUp(){

        val resultText: TextView = findViewById(R.id.result_text)

        if (resultText.text == "Hello Word"){
            resultText.text = "1"
        }else{
            var resultInt = resultText.text.toString(). toInt()
            if (resultInt < 6 ){
                resultInt ++
                resultText.text = resultInt.toString()
            }
        }
    }

}



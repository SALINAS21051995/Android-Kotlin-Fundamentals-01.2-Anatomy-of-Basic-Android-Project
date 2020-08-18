package com.example.android.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { resetDice() }
        val countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener { countUp() }

    }

    private fun rollDice(){
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show();
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
        if(resultText.text == "Hello World!"){
            resultText.text = "1"
        }else if(!resultText.text.equals("6")){
            val number = resultText.text.toString().toInt()
            resultText.text = (number+1).toString()
        }
    }

    private fun resetDice(){
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }


}
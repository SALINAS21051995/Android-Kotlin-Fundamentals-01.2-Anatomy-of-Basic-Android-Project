package com.example.android.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var firstDiceImage: ImageView
    lateinit var secondDiceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.firstDiceImage = findViewById(R.id.first_dice_image)
        this.secondDiceImage = findViewById(R.id.second_dice_image)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDices() }
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { resetDice() }
        val countButton: Button = findViewById(R.id.count_button)
       // countButton.setOnClickListener { countUp() }

    }
    private fun rollDices(){
        firstDiceImage.setImageResource(rollDice())
        secondDiceImage.setImageResource(rollDice())
    }
    private fun rollDice(): Int{
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show();
        val randomInt = (1..6).random()
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource;
    }

    /*private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
        if(resultText.text == "Hello World!"){
            resultText.text = "1"
        }else if(!resultText.text.equals("6")){
            val number = resultText.text.toString().toInt()
            resultText.text = (number+1).toString()
        }
    }*/

    private fun resetDice(){
        this.firstDiceImage.setImageResource(R.drawable.empty_dice)
        this.secondDiceImage.setImageResource(R.drawable.empty_dice)
    }


}
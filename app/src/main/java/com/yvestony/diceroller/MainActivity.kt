package com.yvestony.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
* This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }
/**
* Roll the dice and update the screen with the result.
 */
    private fun rollDice() {
//    create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
//    Update the value on the screen
        val resultTextView: TextView = findViewById(R.id.rolledNumber)
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val sides: Int) {
    /**
     * roll the dice and return a number between 1 and the number of sides
     */
    fun roll(): Int { return (1..sides).random() }
}
package com.yvestony.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
//        Do a dice roll when the app starts
        rollDice()
    }
//    Get the view with the diceImage from the layout
    private val diceImage: ImageView
        get() {
            val diceImage: ImageView = findViewById(R.id.imageView)
            return diceImage
        }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
//    create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
//    Determine which drawable resource Id to use based on the dice roll
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
//        Update the ImageView with the correct drawable resource Id
        diceImage.setImageResource(drawableResource)
//        Update the content description
        diceImage.contentDescription = diceRoll.toString()
    }
}

class Dice(private val sides: Int) {
    /**
     * roll the dice and return a number between 1 and the number of sides
     */
    fun roll(): Int {
        return (1..sides).random()
    }
}
package com.example.dicerollerapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Finding the button in layout and saving the reference in variable 'rollButton'
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            // Displaying a toast message in starting.
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()

            // Updating the textView
            rollDice()
        }
    }

    private fun rollDice() {
        // TODO("Not yet implemented")
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val numSide: Int) {

    // A roll() method to generate a random number between 1 and 6.
    fun roll(): Int {
        return (1..numSide).random()
    }
}
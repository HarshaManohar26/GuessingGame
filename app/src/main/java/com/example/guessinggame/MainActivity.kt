package com.example.guessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    var numberEntered = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val answerGuessed = findViewById<TextInputEditText>(R.id.answerET)
        val rightButton = findViewById<TextView>(R.id.questionTV2)
        val suggestion = findViewById<TextView>(R.id.suggestionTV3)

        val randomNum = (0..1000).random()

        println("random no: $randomNum")

        rightButton.setOnClickListener {

            if (answerGuessed.text.toString().isNullOrEmpty()){
                suggestion.text = "Please enter a number between 0 to 1000"
            }else {

                numberEntered = answerGuessed.text.toString().toInt()

                if (numberEntered == randomNum) {
                    suggestion.text = "You are right!"
                } else if (numberEntered > randomNum) {
                    suggestion.text = "No :) My number is smaller"
                } else if (numberEntered < randomNum) {
                    suggestion.text = "No :) My number is bigger"
                }

            }
        }

    }
}
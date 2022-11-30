package com.example.lukamodric_lv5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val footballer_name=findViewById<TextView>(R.id.ime)
        val description=findViewById<TextView>(R.id.opis)

        val inputName=findViewById<EditText>(R.id.inputime)
        val inputOpis=findViewById<EditText>(R.id.inputopis)
        val Unesi: Button = findViewById<Button>(R.id.Unesi)

        val inputHeight=findViewById<EditText>(R.id.inputVisina)
        val inputWeight=findViewById<EditText>(R.id.inputTezina)
        val Izracunaj: Button = findViewById<Button>(R.id.Izracunaj)


        Unesi.setOnClickListener {

            footballer_name.text = inputName.text
            description.text = inputOpis.text
        }
        Izracunaj.setOnClickListener {

            val bmiIndex = calculateBMI(inputWeight.text.toString().toFloat(),inputHeight.text.toString().toFloat()).toString()
            Toast.makeText(this, bmiIndex, Toast.LENGTH_LONG).show()
        }
    }

    private fun calculateBMI(weight:Float, height:Float):Float{
        return (weight/((height/100)*(height/100)))
    }
}
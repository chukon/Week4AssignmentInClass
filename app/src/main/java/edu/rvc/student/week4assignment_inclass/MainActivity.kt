package edu.rvc.student.week4assignment_inclass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number = (Math.random () * 100_001) .toInt ()
        Toast.makeText (this, "Number to remember: ${number}", Toast.LENGTH_LONG) .show ()
        val txtGuess = findViewById<EditText>(R.id.txtGuess)
        val btnGuess = findViewById<Button>(R.id.btnGuess)
        val btnToast = findViewById<Button>(R.id.btnToast)
        btnGuess.setOnClickListener {
            if (number == txtGuess.text.toString (). toInt ()){
                Toast.makeText (this, "Well remembered the number shown.", Toast.LENGTH_LONG) .show ()
                txtGuess.setText("")
            }
            else{
                Toast.makeText (this, "I'm sorry but it's not the number I showed.", Toast.LENGTH_LONG) .show ()
                txtGuess.setText("")
            }
        }
        btnToast.setOnClickListener{
            number = (Math.random () * 100_001) .toInt ()
            Toast.makeText (this, "Number to remember: ${number}", Toast.LENGTH_LONG) .show ()
        }
    }
}

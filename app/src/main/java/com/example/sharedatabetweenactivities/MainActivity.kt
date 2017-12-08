package com.example.sharedatabetweenactivities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Toast
import com.example.startnewactivity.SecondActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setup Toolbar
        setSupportActionBar(tbMain as Toolbar?)

        //onClick listener for button
        btnNext.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        sendDataToNextActivity()
    }

    private fun sendDataToNextActivity() {

        //get text from edittext
        val strFirstName = etFirstName.text.toString()
        val strLastName = etLastName.text.toString()

        if (!strFirstName.isEmpty() && !strLastName.isEmpty()) {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("fName", strFirstName)
            intent.putExtra("lName", strLastName)
            startActivity(intent)
            etFirstName.text = null
            etLastName.text = null
        } else {
            Toast.makeText(this@MainActivity, "Enter First and Last Name", Toast.LENGTH_SHORT).show()
        }
    }

}

package com.example.startnewactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.example.sharedatabetweenactivities.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //setup toolbar and title to toolbar
        setSupportActionBar(toolbar as Toolbar?)
        (toolbar as Toolbar?)?.title = getString(R.string.second_activity)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //get data from intent
        var strFirstName = intent.getStringExtra("fName")
        var strLastName = intent.getStringExtra("lName")


        //set text from data
        tvFirstName.text = "First Name is : ${strFirstName}"
        tvLastName.text = "Last Name is : ${strLastName}"
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        //implement onbackpressed
        onBackPressed()
        return true
    }
}

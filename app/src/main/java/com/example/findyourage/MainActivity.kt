package com.example.findyourage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_check.setOnClickListener {
            run()
        }
    }
    fun run(){
        if (age.text.isEmpty()){
            Toast.makeText(this,"Please input a year",Toast.LENGTH_SHORT).show()
            return
        }

        var  userNumber = age.text.toString().toInt()
        val current =Calendar.getInstance().get(Calendar.YEAR)
        val result = current - userNumber
        if (userNumber >= current){
            Toast.makeText(this,"Please input a valid year",Toast.LENGTH_SHORT).show()
            age.text.clear()
            display_age.setText("")
            return
        }
        else {

            display_age.setText("You are $result Year(s) old")

            return
        }
    }
}

package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var foodList:ArrayList<String> = arrayListOf<String>( "Hamburger", "Pizza","Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //////////////////////////////
//        textFoodName.text = foodList.random()
//
//        button.setOnClickListener {
//            if (textAddFood.text.trim().isNullOrEmpty()){
//                textAddFood.error = "Please set a valid food."
//            }
//            else
//            if (!foodList.contains(textAddFood.text.toString())){
//                foodList.add(textAddFood.text.toString())
//                textFoodName.setText(textAddFood.text.toString())
//                textAddFood.setText("")
//            }
//            else{
//                textAddFood.error = "Food already exist"
//            }
//        }
//
//        button2.setOnClickListener {
//            textFoodName.text = foodList.random()
//        }

    }
}
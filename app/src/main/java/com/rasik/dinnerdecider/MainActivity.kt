package com.rasik.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Hamburger", "Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val rndFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[rndFood]
        }

        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            if(newFood.length>0){
                foodList.add(newFood)
                addFoodTxt.text.clear()
            }else{
                Toast.makeText(this, "Add some food", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

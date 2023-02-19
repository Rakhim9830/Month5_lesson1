package com.rahim.lesson1_month5

import android.app.Application
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.rahim.lesson1_month5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View {
   private val presenter = Presenter()
    private var count = 0
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        presenter.fillCounterView(this)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
     with(binding){
         btnPlus.setOnClickListener{
             presenter.increment()
             if (count ==10){

             }

         }
         btnMinus.setOnClickListener{
             presenter.decrement()
         }
     }
    }

    override fun showCount(count:Int) {
        binding.txResult.text = count.toString()
    }


    override fun toast(message: String) {
        val myToast = Toast.makeText(applicationContext,message,Toast.LENGTH_SHORT)
        myToast.show()
    }

    override fun color(color:Int) {
        binding.txResult.setTextColor(Color.GREEN)
    }

    override fun defaultColor(defaultColor: Int) {
        binding.txResult.setTextColor(Color.BLACK)
    }


}
package com.example.assignment2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.assignment2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun changeBackground(view: View) {
        binding.mainLayout.setBackgroundColor(Color.rgb(getRandomColor(), getRandomColor(), getRandomColor()))
    }

    fun changeButtonBackground(view: View) {
        binding.imageButton.setBackgroundColor(Color.rgb(getRandomColor(), getRandomColor(), getRandomColor()))
    }

    fun getRandomColor(): Int {
        var randomNumber: Int = (0..256).random()
        return randomNumber
    }
}
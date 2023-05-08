package com.example.lab5_1

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.lab5_1.databinding.ActivityDetailsBinding

class Details : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tvHeader.text = intent.getStringExtra("headerText")
        binding.tvDescription.text = intent.getStringExtra("description")
        //binding.ivMain.setImageResource(intent.getIntExtra("image",0))

}
}
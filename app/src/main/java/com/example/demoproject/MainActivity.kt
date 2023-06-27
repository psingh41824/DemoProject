package com.example.demoproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demoproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

     private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imagesSlider1 = listOf(
          R.drawable.praimg ,
          R.drawable.pra2,
            R.drawable.pra3
        )
        val imagesSlider2 = listOf(
            R.drawable.praimg ,
            R.drawable.pra2,
            R.drawable.pra3
        )
//        val imagesSlider2 = listOf(
//            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Sunflower_from_Silesia2.jpg/1200px-Sunflower_from_Silesia2.jpg",
//            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Cat03.jpg/1025px-Cat03.jpg",
//            "https://kinsta.com/wp-content/uploads/2020/08/tiger-jpg.jpg"
//        )

       binding.viewPager1.adapter = SliderAdapter(imagesSlider1)
        binding.viewPager2.adapter = SliderAdapter(imagesSlider2)
    }
}
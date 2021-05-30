package com.devpadawan.slotmachine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.devpadawan.slotmachine.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {

    val random = Random()
    var slot1 = 0
    var slot2 = 0
    var slot3 = 0
    var win = 10000


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlay.setOnClickListener {
           Toast.makeText(this, "You've spinned - 1000 euros discounted", Toast.LENGTH_SHORT).show()

            binding.imgSlot1.setImageResource(R.drawable.animation)
            binding.imgSlot2.setImageResource(R.drawable.animation)
            binding.imgSlot3.setImageResource(R.drawable.animation)

        }

    }
}
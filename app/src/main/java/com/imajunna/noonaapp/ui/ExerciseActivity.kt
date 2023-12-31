package com.imajunna.noonaapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.imajunna.noonaapp.R
import com.imajunna.noonaapp.databinding.ActivityExerciseBinding
import com.imajunna.noonaapp.databinding.ActivityFactOrMythBinding


class ExerciseActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExerciseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExerciseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            startActivity(Intent(this, FactOrMythActivity::class.java))
            finish()
        }

        binding.next.setOnClickListener {
            startActivity(Intent(this, Exercise2Activity::class.java))
            finish()
        }
    }
}
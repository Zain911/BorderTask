package com.example.task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.phoneCodeTextView.setText(binding.countryPicker.selectedCountryCodeWithPlus.toString())

        binding.countryPicker.setOnCountryChangeListener {
            binding.phoneCodeTextView.setText(binding.countryPicker.selectedCountryCodeWithPlus.toString())
        }
    }
}
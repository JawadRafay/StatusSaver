package com.rafay.statussaverapp.views.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.rafay.statussaverapp.R
import com.rafay.statussaverapp.databinding.ActivityMainBinding


class MainActivity : ComponentActivity() {

    private val activity = this
    private val binding get() = ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.apply {


        }
    }
}



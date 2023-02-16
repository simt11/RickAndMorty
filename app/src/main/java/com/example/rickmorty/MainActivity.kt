package com.example.rickmorty

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.rickmorty.databinding.ActivityMainBinding
import com.example.rickmorty.ui.fragments.StartFragment
import com.example.rickmorty.utilits.replaceFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        toolbar = binding.mainToolbar
        setSupportActionBar(toolbar)
        title = getString(R.string.start_title)
        replaceFragment(StartFragment(), false)

    }
}
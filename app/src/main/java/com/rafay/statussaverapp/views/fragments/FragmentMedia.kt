package com.rafay.statussaverapp.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rafay.statussaverapp.R
import com.rafay.statussaverapp.databinding.FragmentMediaBinding

class FragmentMedia : Fragment() {

 private val binding get() = FragmentMediaBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.apply {

        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = binding.root
    }


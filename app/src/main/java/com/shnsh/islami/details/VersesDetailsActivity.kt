package com.shnsh.islami.details

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.shnsh.islami.R
import com.shnsh.islami.adapters.VersesAdapter
import com.shnsh.islami.databinding.ActivityVersesDetailsBinding

class VersesDetailsActivity : AppCompatActivity() {
    lateinit var binding:ActivityVersesDetailsBinding
    lateinit var adapter: VersesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityVersesDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        }
    }

package com.shnsh.islami.activities

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
import com.shnsh.islami.R
import com.shnsh.islami.databinding.ActivityMainBinding
import com.shnsh.islami.fragments.AhadithFragment
import com.shnsh.islami.fragments.QuranFragment
import com.shnsh.islami.fragments.RadioFragment
import com.shnsh.islami.fragments.SebhaFragment

class MainActivity : AppCompatActivity() {
   lateinit var binding_:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        val quarnFragment=QuranFragment()
        val ahadithFragment=AhadithFragment()
        val sabhaFragment=SebhaFragment()
        val radioFragment=RadioFragment()
        super.onCreate(savedInstanceState)


        binding_=ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding_.root)
        setCurrentFragment(quarnFragment)
        binding_.bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.quran->setCurrentFragment(quarnFragment)
                R.id.ahadith->setCurrentFragment(ahadithFragment)
                R.id.sebha->setCurrentFragment(sabhaFragment)
                R.id.radio->setCurrentFragment(radioFragment)
        }
            true
        }
        }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,fragment)
            .commit()
    }
}
package com.shnsh.islami.fragments

import android.content.Intent
import com.shnsh.islami.models.AppConstants
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shnsh.islami.adapters.QuranAdapter
import com.shnsh.islami.databinding.FragmentQuranBinding
import com.shnsh.islami.details.VersesDetailsActivity

class QuranFragment : Fragment() {
    lateinit var  adapter: QuranAdapter
    lateinit var binding:FragmentQuranBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding=FragmentQuranBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter= QuranAdapter(quranList)
        binding.quranRecycle.adapter=adapter
        adapter.onItemClickListener= QuranAdapter.OnItemClickListener{ quransData, position ->
            val intent= Intent(activity,VersesDetailsActivity::class.java)
            startActivity(intent)
        }
    }
    val quranList= AppConstants.getQuranData()




}
package com.shnsh.islami.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shnsh.islami.R
import com.shnsh.islami.databinding.ItemAhadithBinding
import com.shnsh.islami.models.AhadithData

class HadithAdapter(val ahadithList: List<AhadithData>):RecyclerView.Adapter<HadithAdapter.AhadithViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AhadithViewHolder {
        val binding=ItemAhadithBinding.inflate(LayoutInflater.from(parent.context),
        parent,false
        )
        return AhadithViewHolder(binding)
    }

    override fun getItemCount(): Int =ahadithList.size

    override fun onBindViewHolder(holder: AhadithViewHolder, position: Int) {
        val hadithesList=ahadithList[position]
        holder.titles.text=hadithesList.title
        holder.contents.text=hadithesList.content
    }


    class AhadithViewHolder(val binding:ItemAhadithBinding):RecyclerView.ViewHolder(binding.root){
        val titles=binding.hadethTitle
        val contents=binding.hadethDescription



    }


}
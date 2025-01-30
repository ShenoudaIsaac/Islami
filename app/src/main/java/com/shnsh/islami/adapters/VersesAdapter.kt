package com.shnsh.islami.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shnsh.islami.databinding.ItemVersesBinding
import com.shnsh.islami.models.VersesData

class VersesAdapter(val verses:MutableList<VersesData>):RecyclerView.Adapter<VersesAdapter.VersesViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VersesViewHolder {
        val binding=ItemVersesBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return VersesViewHolder(binding)
    }

    override fun getItemCount(): Int =verses.size

    override fun onBindViewHolder(holder: VersesViewHolder, position: Int) {
        val item=verses[position]
        holder.textVerse.text=item.verseText
    }
    class VersesViewHolder(val binding: ItemVersesBinding): RecyclerView.ViewHolder(binding.root){
        val textVerse=binding.textVerses
    }
}
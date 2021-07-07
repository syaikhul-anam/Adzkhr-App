package com.syaikhulanam.adzkhr.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syaikhulanam.adzkhr.R
import com.syaikhulanam.adzkhr.model.Dzikir
import kotlinx.android.synthetic.main.rv_dzikir.view.*

class DzikirAdapter(private var dzikir:ArrayList<Dzikir>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        //call layout row
        val v = LayoutInflater.from(parent.context).inflate(R.layout.rv_dzikir,parent,false)

        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return dzikir.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        //bind data's here..
        holder.itemView.tv_sequence.text = dzikir[position].sequence
        holder.itemView.tv_title.text = dzikir[position].title
        holder.itemView.tv_repeat.text = dzikir[position].repeat
        holder.itemView.tv_ayat.text = dzikir[position].ayat
        holder.itemView.tv_latin.text = dzikir[position].latin
        holder.itemView.tv_terjemah.text = dzikir[position].translate
        holder.itemView.tv_faedah.text = dzikir[position].faedah
    }


    class ViewHolder(v: View?): RecyclerView.ViewHolder(v!!), View.OnClickListener{
        override fun onClick(v: View?) {
            //onClick function goes here....
        }
        init {
            itemView.setOnClickListener(this)
        }
    }


}
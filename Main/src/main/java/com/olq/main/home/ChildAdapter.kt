package com.olq.main.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.olq.main.R
import com.olq.main.bean.CategoryBean
import com.olq.main.databinding.ItemFatherBinding

/**
 * create 2020/12/19 15:31
 *  create admin
 **/
class ChildAdapter(var context:Context,var list:MutableList<CategoryBean>) : RecyclerView.Adapter<ChildViewHolder>() {

    var checkId=0;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        var item= ItemFatherBinding.inflate(LayoutInflater.from(parent.context))
        return ChildViewHolder(item)
    }


    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        holder.bind.tvName.text= list[position].name
        holder.itemView.setOnClickListener {
            checkId=position
            notifyDataSetChanged()
        }
        if (checkId==position){
            holder.bind.ivCheck.visibility=View.VISIBLE
            holder.bind.tvName.setTextColor(ContextCompat.getColor(context, R.color.bg_status))
        }else{
            holder.bind.tvName.setTextColor(ContextCompat.getColor(context, R.color.black))
            holder.bind.ivCheck.visibility=View.GONE
        }

    }


}

class ChildViewHolder(var bind: ItemFatherBinding) : RecyclerView.ViewHolder(bind.root)

//class ChildViewHolder(var bind: ItemFatherBinding) : RecyclerView.ViewHolder(bind.root)
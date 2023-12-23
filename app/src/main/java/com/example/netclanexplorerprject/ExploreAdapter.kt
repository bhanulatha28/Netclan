package com.example.netclanexplorerprject

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExploreAdapter(): RecyclerView.Adapter<ExploreAdapter.ViewHolder>() {
    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view)
    {
        val invite=view.findViewById<TextView>(R.id.invite)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExploreAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.container_items, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExploreAdapter.ViewHolder, position: Int) {
        holder.invite.setOnClickListener {
            holder.invite.text="Pending"
            holder.invite.setTextColor(Color.GRAY)
        }
    }

    override fun getItemCount(): Int {
        return  10
    }

}
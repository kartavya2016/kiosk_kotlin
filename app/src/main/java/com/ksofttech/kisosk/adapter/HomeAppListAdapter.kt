package com.ksofttech.kisosk.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ksofttech.kisosk.R
import com.ksofttech.kisosk.model.AddedAppListModel

class HomeAppListAdapter(private val mAppList: List<AddedAppListModel>):RecyclerView.Adapter<HomeAppListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.main_home_card_view_design, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mAppList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val AddedAppListModel=mAppList[position]


    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val appImage:ImageView=itemView.findViewById(R.id.appIconImageView)
        val appName:TextView=itemView.findViewById(R.id.appNameTextView)


    }
}
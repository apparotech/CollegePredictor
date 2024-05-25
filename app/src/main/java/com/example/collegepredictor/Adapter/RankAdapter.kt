package com.example.collegepredictor.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.collegepredictor.model.ModelClass
import android.widget.TextView
import com.example.collegepredictor.R

class RankAdapter (private val context: Context, private var mList: List<ModelClass>)  : RecyclerView.Adapter<RankAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.college_show_layout,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val symptomsClass = mList[position]

        holder.collegeName.text = symptomsClass.Institute
        holder.category.text = symptomsClass.Category
        holder.branch.text = symptomsClass.Program
        holder.course.text = symptomsClass.Stream
        holder.quota.text = symptomsClass.Quota


    }
    fun filterList(filterlist: ArrayList<ModelClass>) {
        mList = filterlist
        notifyDataSetChanged()
    }
    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val collegeName: TextView = itemView.findViewById(R.id.college_name)
        val branch: TextView = itemView.findViewById(R.id.college_branch)
        val course: TextView = itemView.findViewById(R.id.college_course)
        val quota: TextView = itemView.findViewById(R.id.college_quota)
        val category: TextView = itemView.findViewById(R.id.college_category)
    }
}
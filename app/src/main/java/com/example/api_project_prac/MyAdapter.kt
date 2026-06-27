package com.example.api_project_prac

import android.app.Activity
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.google.android.material.imageview.ShapeableImageView
import com.squareup.picasso.Picasso

class MyAdapter(val context: Activity, val productArraylist: List<Product>) :
    Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(
        p0: ViewGroup,
        p1: Int
    ): MyAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(p0.context).inflate(R.layout.each_item, p0, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(p0: MyAdapter.MyViewHolder, p1: Int) {
        val current = productArraylist[p1]
        p0.title.text = current.title
        p0.rating.text = current.rating.toString()
        Picasso.get().load(current.thumbnail).into(p0.image)
    }

    override fun getItemCount(): Int {
        return productArraylist.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var title: TextView = itemView.findViewById(R.id.prod_title)
        var rating: TextView = itemView.findViewById(R.id.ratings)
        var image: ShapeableImageView = itemView.findViewById(R.id.prod_img)

    }
}
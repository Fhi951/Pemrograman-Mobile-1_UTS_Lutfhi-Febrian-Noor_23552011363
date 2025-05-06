package com.example.car_up

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.BaseAdapter
import android.widget.ImageView

class PartAdapter(private val context: Context, private val parts: Array<Int>) : BaseAdapter() {
    override fun getCount() = parts.size
    override fun getItem(position: Int) = parts[position]
    override fun getItemId(position: Int) = position.toLong()
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val imageView = ImageView(context)
        imageView.setImageResource(parts[position])
        imageView.layoutParams = AbsListView.LayoutParams(300, 300)
        imageView.scaleType = ImageView.ScaleType.CENTER_CROP
        return imageView
    }
}
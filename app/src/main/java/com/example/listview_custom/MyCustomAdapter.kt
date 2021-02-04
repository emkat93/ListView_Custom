package com.example.listview_custom

import android.content.ClipData
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyCustomAdapter(var ctx: Context, var ourResource: Int, var Items: ArrayList<Profile>):
    ArrayAdapter<Profile>(ctx,ourResource,Items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater = LayoutInflater.from(ctx)
        val view = layoutInflater.inflate(ourResource, null)

        val name = view.findViewById<TextView>(R.id.idName1)
        val phone = view.findViewById<TextView>(R.id.idPhone1)
        val img = view.findViewById<ImageView>(R.id.idImage1)

        name.text = Items[position].Name
        phone.text = Items[position].Phone
        img.setImageDrawable(ctx.resources.getDrawable(Items[position].img))

        return view
    }

}
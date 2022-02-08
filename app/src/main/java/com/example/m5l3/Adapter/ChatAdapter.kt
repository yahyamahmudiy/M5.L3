package com.example.m5l3.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.m5l3.Model.Chat
import com.example.m5l3.R
import com.google.android.material.imageview.ShapeableImageView

class ChatAdapter(var context: Context,var items:ArrayList<Chat>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_appearance,parent,false)
        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chat = items[position]

        if (holder is MessageViewHolder){

            val iv_theme = holder.iv_theme
            //val iv_profile = holder.iv_profile
            //val tv_fullname = holder.tv_fullname
            //val tv_message = holder.tv_message

            iv_theme.setImageResource(chat.theme)
            /*iv_profile.setImageResource(chat.profile)
            tv_fullname.text = chat.fullname
            tv_message.text = chat.message

            if (chat.message == ""){
                tv_fullname.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20F)
                tv_fullname.setTextColor(Color.parseColor("#FF1E88E5"))
            }else{
                tv_message.visibility = View.VISIBLE
            }*/
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class MessageViewHolder(var view: View):RecyclerView.ViewHolder(view) {
        var iv_theme:ShapeableImageView
        /*val iv_profile: ShapeableImageView
        var tv_fullname: TextView
        var tv_message: TextView*/

        init {
            iv_theme = view.findViewById(R.id.theme)
            /*iv_profile = view.findViewById(R.id.iv_profile)
            tv_fullname = view.findViewById(R.id.tv_fullname)
            tv_message = view.findViewById(R.id.tv_message)*/

        }
    }

}
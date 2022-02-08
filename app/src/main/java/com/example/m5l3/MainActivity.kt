package com.example.m5l3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.m5l3.Adapter.ChatAdapter
import com.example.m5l3.Model.Chat

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.appearance_page)

        initViews()
    }

    fun initViews(){
        recyclerView = findViewById(R.id.recyclerView123)
        //recyclerView.setLayoutManager(GridLayoutManager(this,1))
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        refreshAdapter(getAllChats())
    }

    fun refreshAdapter(chats:ArrayList<Chat>){
        val adapter = ChatAdapter(this,chats)
        recyclerView.adapter = adapter
    }

    fun getAllChats():ArrayList<Chat>{
        val chats:ArrayList<Chat> = ArrayList()

        chats.add(Chat(R.drawable.img_15))
        chats.add(Chat(R.drawable.img_16))
        chats.add(Chat(R.drawable.img_17))
        chats.add(Chat(R.drawable.img_18))
        chats.add(Chat(R.drawable.img_19))
        chats.add(Chat(R.drawable.img_20))

        /*chats.add(Chat(R.mipmap.ic_location,"Find People Nearby",""))
        chats.add(Chat(R.mipmap.ic_add_person,"Invite Friends",""))

        chats.add(Chat(R.drawable.img,"Nazirov","last seen recently"))
        chats.add(Chat(R.drawable.img_1,"OgabekDev","last seen recently"))
        chats.add(Chat(R.drawable.img_2,"Primqulov Jabbor","last seen recently"))
        chats.add(Chat(R.drawable.img_3,"Matyaqubov","last seen recently"))
        chats.add(Chat(R.drawable.img_4,"Азиз","last seen recently"))
        chats.add(Chat(R.drawable.img_5,"Mr Mansur","last seen recently"))
        chats.add(Chat(R.drawable.img_6,"Jamshid","last seen recently"))
        chats.add(Chat(R.drawable.img_7,"Muhammadrizo","last seen recently"))
        chats.add(Chat(R.drawable.img_8,"Saidahmad","last seen recently"))
        chats.add(Chat(R.drawable.img_9,"Wonmirzo","last seen recently"))*/


        return chats
    }
}
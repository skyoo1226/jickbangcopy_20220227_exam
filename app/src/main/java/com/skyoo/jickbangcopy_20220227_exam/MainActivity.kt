package com.skyoo.jickbangcopy_20220227_exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skyoo.jickbangcopy_20220227_exam.adapters.RoomAdapter
import com.skyoo.jickbangcopy_20220227_exam.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()

    lateinit var mRoomAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(RoomData(8000, "서울시 동대문구", 7, "1번째 방입니다."))
        mRoomList.add(RoomData(9000, "서울시 서대문구", 8, "2번째 방입니다."))
        mRoomList.add(RoomData(10000, "서울시 강북구", -5, "3번째 방입니다."))
        mRoomList.add(RoomData(11000, "서울시 강동구", 10, "4번째 방입니다."))
        mRoomList.add(RoomData(12000, "서울시 강서구", 0, "5번째 방입니다."))
        mRoomList.add(RoomData(13000, "서울시 종로구", 12, "6번째 방입니다."))
        mRoomList.add(RoomData(16000, "서울시 천호구", 20, "7번째 방입니다."))
        mRoomList.add(RoomData(5000, "서울시 의정부구", 2, "8번째 방입니다."))
        mRoomList.add(RoomData(4000, "서울시 만리구", 1, "9번째 방입니다."))
        mRoomList.add(RoomData(6000, "서울시 북구", 4, "10번째 방입니다."))
        mRoomList.add(RoomData(19000, "서울시 남구", 7, "11번째 방입니다."))
        mRoomList.add(RoomData(27000, "서울시 서구", 22, "12번째 방입니다."))
        mRoomList.add(RoomData(20000, "서울시 남대문구", -1, "13번째 방입니다."))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mRoomAdapter

        roomListView.setOnItemClickListener { adapterView, view, position, l ->

           val clickedRoom = mRoomList[position]

            val myIntent = Intent( this, ViewRoomDetailActivity::class.java )

            myIntent.putExtra("room", clickedRoom)

            startActivity(myIntent)

        }


    }
}
package com.skyoo.jickbangcopy_20220227_exam

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
        mRoomList.add(RoomData(9000, "서울시 동대문구", 8, "2번째 방입니다."))
        mRoomList.add(RoomData(10000, "서울시 동대문구", 9, "3번째 방입니다."))
        mRoomList.add(RoomData(11000, "서울시 동대문구", 10, "4번째 방입니다."))
        mRoomList.add(RoomData(12000, "서울시 동대문구", 11, "5번째 방입니다."))
        mRoomList.add(RoomData(13000, "서울시 동대문구", 12, "6번째 방입니다."))
        mRoomList.add(RoomData(16000, "서울시 동대문구", 20, "7번째 방입니다."))
        mRoomList.add(RoomData(5000, "서울시 동대문구", 2, "8번째 방입니다."))
        mRoomList.add(RoomData(4000, "서울시 동대문구", 1, "9번째 방입니다."))
        mRoomList.add(RoomData(6000, "서울시 동대문구", 4, "10번째 방입니다."))
        mRoomList.add(RoomData(19000, "서울시 동대문구", 7, "11번째 방입니다."))
        mRoomList.add(RoomData(27000, "서울시 동대문구", 22, "12번째 방입니다."))
        mRoomList.add(RoomData(20000, "서울시 동대문구", -1, "13번째 방입니다."))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mRoomAdapter


    }
}
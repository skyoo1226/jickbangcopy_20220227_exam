package com.skyoo.jickbangcopy_20220227_exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skyoo.jickbangcopy_20220227_exam.datas.RoomData

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData = intent.getSerializableExtra("room") as RoomData




    }
}
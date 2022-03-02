package com.skyoo.jickbangcopy_20220227_exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skyoo.jickbangcopy_20220227_exam.datas.RoomData
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData = intent.getSerializableExtra("room") as RoomData

//        가공된 가격 표시로 가져오기
        txtPrice.text = roomData.getFormattedPrice()
//        설명관 주소는 그대로 가져 옴
        txtDescription.text = roomData.description
        txtAddress.text = roomData.address
//        가공된 10층-> 반지하, 지하 등 문구로 변환된 자료 가져오기
        txtFloor.text = roomData.getFormattedFloor()


    }
}
package com.skyoo.jickbangcopy_20220227_exam.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.skyoo.jickbangcopy_20220227_exam.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomData>
) : ArrayAdapter<RoomData>(mContext, resId, mList) {

}
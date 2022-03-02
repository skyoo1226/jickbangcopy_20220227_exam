package com.skyoo.jickbangcopy_20220227_exam.adapters

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.skyoo.jickbangcopy_20220227_exam.R
import com.skyoo.jickbangcopy_20220227_exam.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomData>
) : ArrayAdapter<RoomData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.room_list_item, null)
        }

        val  row = tempRow!!

        val data = mList[position]

        val txtprice = row.findViewById<TextView>(R.id.txtPrice)
        val txtAddressFloor = row.findViewById<TextView>(R.id.txtAddressFloor)
        val txtDescription = row.findViewById<TextView>(R.id.txtDescription)

//        txtprice.text = data.price.toString()  => 가격을 string(몇 억과 숫자에 컴마를 추가해 주는 값을 불러오게 아래와 같이 수정
        txtprice.text = data.getFormattedPrice()

        txtDescription.text = data.description

        txtAddressFloor.text = "${data.address}, ${data.getFormattedFloor()}"

        return row


    }



}
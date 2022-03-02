package com.skyoo.jickbangcopy_20220227_exam.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.*

// 하나의 방(class)에는 4가지 정보를 넣을 예정, 가격,행정구역,층수,설명문구 - 멤버변수로 만듬.


class RoomData(
    val price : Int,
    val address : String,
    val floor : Int,
    val description : String,
//    ViewRoomDetailActivity에 RoomData를 각각 보내지 않고 Serializable로 한꺼번에 보냄
)  : Serializable {

//    층수값을 int값을 => 층수, 반지하, 지하1층 형태로 string으로 변하는 함수 작성

    fun getFormattedFloor() : String {

        val floorStr : String

        if (floor > 0) {
            floorStr = "${floor}층"
        }
        else if (floor == 0) {
            floorStr = "반지하"
        }
        else {
            floorStr = "지하 ${ -floor }층"
        }

        return floorStr


    }

//    가격은 억 단위와 천단위 로 변경 함 예) 1억 8천

    fun getFormattedPrice() : String {

//        천단위 컴마 찍는 get넘버Instance 추가

        if (price < 10000)  {

            val formattedPrice = NumberFormat.getNumberInstance(Locale.KOREA).format(price)

            return  formattedPrice

        }

//        억이 넘었을때 숫자를 계산하여 억 단위 표시
//        단 2억, 1억인 경우 뒤에 0이 표시 됨 수정 어떻게???
        else {
            val  uk = price / 10000
            val  rest = price % 10000
            val formattedRest = NumberFormat.getNumberInstance(Locale.KOREA).format(rest)

            return "${uk}억 ${formattedRest}"

        }
    }



}

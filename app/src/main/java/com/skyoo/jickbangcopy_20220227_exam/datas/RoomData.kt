package com.skyoo.jickbangcopy_20220227_exam.datas

// 하나의 방(class)에는 4가지 정보를 넣을 예정, 가격,행정구역,층수,설명문구 - 멤버변수로 만듬.


class RoomData(
    val price : Int,
    val address : String,
    val floor : Int,
    val description : String,
) {

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

//    가격은 억 단위와 천단위 로 변경 함



}

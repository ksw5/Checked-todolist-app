package com.example.tasktracker

object DataObject {
    var listdata = mutableListOf<CardInfo>()

    fun setData(title: String) {
        listdata.add(CardInfo(title))
    }

    fun getAllData() : List<CardInfo> {
        return listdata
    }

    fun deleteAll() {
        listdata.clear()
    }
}
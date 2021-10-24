package com.example.headsup_db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHlpr(context: Context):SQLiteOpenHelper(context,"details",null,1) {
    var database:SQLiteDatabase=writableDatabase
    override fun onCreate(p0: SQLiteDatabase?) {
        if (p0 != null) {
            p0.execSQL("create table celebebrity(name text,taboo1 text,taboo2 text,taboo3 text)")
        }
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

    fun addcelebrity(name:String,taboo1:String,taboo2:String,taboo3:String,){
        var content=ContentValues()
        content.put("name",name)
        content.put("taboo1",taboo1)
        content.put("taboo2",taboo2)
        content.put("taboo3",taboo3)
        database.insert("celebebrity",null,content)
    }
}
package com.example.janitha.temperassignment.utils

import android.app.Application
import com.beust.klaxon.Klaxon
import com.example.janitha.temperassignment.objects.Job
import org.json.JSONObject

class DataUtils {
    companion object {
        fun readJSON(name: String, application: Application, date: String): ArrayList<Job> {
            val klaxon = Klaxon()
            val json = application.assets.open(name).bufferedReader().use {
                it.readText()
            }

            val jo = JSONObject(json)
            val firstDay = jo.getJSONObject("data").getJSONArray(date).toString()

            return klaxon.parseArray<Job>(firstDay) as ArrayList<Job>
        }
    }
}
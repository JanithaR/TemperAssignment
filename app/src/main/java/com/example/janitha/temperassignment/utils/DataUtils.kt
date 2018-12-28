package com.example.janitha.temperassignment.utils

import android.app.Application
import com.beust.klaxon.Klaxon
import com.example.janitha.temperassignment.objects.Job
import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.*

class DataUtils {
    companion object {
        fun readJSON(fileName: String, application: Application, date: String): ArrayList<Job>? {
            if (!fileName.contains(".json", true)) return null
            if (date.isEmpty()) return null

            return try {
                SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(date)

                val klaxon = Klaxon()
                val json = application.assets.open(fileName).bufferedReader().use {
                    it.readText()
                }
                val jo = JSONObject(json)
                val jobs = jo.getJSONObject("data").getJSONArray(date).toString()

                klaxon.parseArray<Job>(jobs) as ArrayList<Job>
            } catch (e : Exception) {
                null
            }
        }
    }
}
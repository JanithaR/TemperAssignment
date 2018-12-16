package com.example.janitha.temperassignment

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.beust.klaxon.Klaxon
import com.example.janitha.temperassignment.adapters.JobsAdapter
import com.example.janitha.temperassignment.objects.Job
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    var firstDayJobs: ArrayList<Job> = ArrayList()
    var secondDayJobs: ArrayList<Job> = ArrayList()
    var thirdDayJobs: ArrayList<Job> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        readJSON("jobsearch.json")
        init()
    }

    private fun init() {
        recyclerViewJobs.layoutManager = LinearLayoutManager(this)

        var allJobs: ArrayList<Job> = ArrayList()
        allJobs.addAll(firstDayJobs)
        allJobs.addAll(secondDayJobs)
        allJobs.addAll(thirdDayJobs)

        recyclerViewJobs.adapter = JobsAdapter(allJobs, this)
    }

    private fun readJSON(name: String) {
        val klaxon = Klaxon()
        val json = application.assets.open(name).bufferedReader().use {
            it.readText()
        }

        val jo = JSONObject(json)
        val firstDay = jo.getJSONObject("data").getJSONArray("2018-05-22").toString()
        val secondDay = jo.getJSONObject("data").getJSONArray("2018-05-23").toString()
        val thirdDay = jo.getJSONObject("data").getJSONArray("2018-05-24").toString()

        firstDayJobs = klaxon.parseArray<Job>(firstDay) as ArrayList<Job>
        secondDayJobs = klaxon.parseArray<Job>(secondDay) as ArrayList<Job>
        thirdDayJobs = klaxon.parseArray<Job>(thirdDay) as ArrayList<Job>

        println("xxx")
    }
}
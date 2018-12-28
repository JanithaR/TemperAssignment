package com.example.janitha.temperassignment

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.janitha.temperassignment.adapters.JobsAdapter
import com.example.janitha.temperassignment.objects.Job
import com.example.janitha.temperassignment.utils.DataUtils.Companion.readJSON
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var jobs: ArrayList<Job> = ArrayList();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()
        init()
    }

    private fun loadData() {
        // * having the dates as keys in the response is a weird choice of structuring it.
        // * it makes the data parsing unnecessarily difficult.
        // * therefore, I have resorted to hardcoding here.
        // * check repo README
        val firstDayJobs: ArrayList<Job> = readJSON("jobsearch.json", application, "2018-05-22")
        val secondDayJobs: ArrayList<Job> = readJSON("jobsearch.json", application, "2018-05-23")
        val thirdDayJobs: ArrayList<Job> = readJSON("jobsearch.json", application, "2018-05-24")

        jobs.addAll(firstDayJobs)
        jobs.addAll(secondDayJobs)
        jobs.addAll(thirdDayJobs)
    }

    private fun init() {
        recyclerViewJobs.layoutManager = LinearLayoutManager(this)
        recyclerViewJobs.setHasFixedSize(true)
        recyclerViewJobs.adapter = JobsAdapter(jobs, this)
    }
}
package com.example.janitha.temperassignment.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.janitha.temperassignment.R
import com.example.janitha.temperassignment.objects.Job
import kotlinx.android.synthetic.main.list_item_jobs.view.*

class JobsAdapter(val items: ArrayList<Job>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {
    lateinit var mContext: Context

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        mContext = context

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_jobs, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.titleTextView?.text = items[position].title
        holder?.maxEarningPerHourTextView?.text = items[position].max_possible_earnings_hour.toString()
        holder?.clientNameTextView?.text = items[position].client.name
        holder?.distanceTextView?.text = items[position].distance.toString()
        holder?.ratingBar?.rating = items[position].client.rating.average.toFloat()
        holder?.reviewCountTextView?.text = items[position].client.rating.count.toString()
        holder?.openPositionsTextView?.text = items[position].open_positions.toString()
        holder?.shiftStartTimeTextView?.text = items[position].shifts[0].start_time
        holder?.shiftDurationTextView?.text = mContext.getString(R.string.hour_s).format(items[position].shifts[0].duration)
        holder?.tempersNeededTextView?.text = items[position].shifts[0].tempers_needed.toString()
    }
}

class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val titleTextView = view.textViewTitle
    val photoImageView = view.imageViewPhoto
    val maxEarningPerHourTextView = view.textViewMaxEarningPerHour
    val clientNameTextView = view.textViewClientName
    val distanceTextView = view.textViewDistance
    var ratingBar = view.ratingBar
    var reviewCountTextView = view.textViewReviewCount
    var openPositionsTextView = view.textViewOpenPositions
    var shiftStartTimeTextView = view.textViewShiftStartTime
    var shiftDurationTextView = view.textViewShiftDuration
    var tempersNeededTextView = view.textViewTempersNeeded
}

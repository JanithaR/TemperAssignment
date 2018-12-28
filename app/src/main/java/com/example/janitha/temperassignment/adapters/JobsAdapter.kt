package com.example.janitha.temperassignment.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import com.example.janitha.temperassignment.R
import com.example.janitha.temperassignment.objects.Job
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_item_jobs_card.view.*

class JobsAdapter(private val items: ArrayList<Job>, private val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    private lateinit var mContext: Context

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        mContext = context

        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.list_item_jobs_card, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val job = items[position]

        holder.titleTextView.text = job.title
        holder.maxEarningPerHourTextView.text = mContext.getString(R.string.max_earning_s).format(job.max_possible_earnings_hour)
        holder.clientNameTextView.text = job.client.name
        holder.distanceTextView.text = mContext.getString(R.string.km_s).format(job.distance)
        holder.ratingBar.rating = job.client.rating.average.toFloat()
        holder.reviewCountTextView.text = mContext.getString(R.string.reviews).format(job.client.rating.count)
        holder.tempersNeededTextView.text = job.shifts[0].tempers_needed.toString()

        var infoText:String = mContext.getString(R.string.info).format(job.open_positions, job.shifts[0].start_time, job.shifts[0].duration)

        if (job.open_positions == 1) {
            infoText = infoText.replace("(s)", "")
        }

        holder.infoTextView.text = infoText

        if (job.client.photos.isNotEmpty() && job.client.photos[0].formats.isNotEmpty()) {
            Picasso.get()
                    .load(job.client.photos[0].formats[0].cdn_url)
                    .placeholder(R.drawable.stub_job_photo)
                    .into(holder.photoImageView)
        }
    }
}

class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val titleTextView:TextView = view.textViewTitle as TextView
    val photoImageView:ImageView = view.imageViewPhoto as ImageView
    val maxEarningPerHourTextView:TextView = view.textViewMaxEarningPerHour as TextView
    val clientNameTextView:TextView = view.textViewClientName as TextView
    val distanceTextView:TextView = view.textViewDistance as TextView
    var ratingBar:RatingBar = view.ratingBar as RatingBar
    var reviewCountTextView:TextView = view.textViewReviewCount as TextView
    var tempersNeededTextView:TextView = view.textViewTempersNeeded as TextView
    var infoTextView:TextView = view.textViewInfo as TextView
}

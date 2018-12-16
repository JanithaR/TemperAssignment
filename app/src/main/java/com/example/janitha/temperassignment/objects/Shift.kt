package com.example.janitha.temperassignment.objects

data class Shift(
        val currency: String = "",
        val duration: Int = 0,
        val earnings_per_hour: Double = 0.0,
        val end_datetime: String = "",
        val end_time: String = "",
        val is_auto_accepted_when_applied_for: Int = 0,
        val start_date: String = "",
        val start_datetime: String = "",
        val start_time: String = "",
        val tempers_needed: Int = 0
)
package com.example.janitha.temperassignment.objects

data class Job(
        val client: Client = Client(),
        val date: Date = Date(),
        val distance: Int = 0,
        val id: Int = 0,
        val job_category: JobCategory = JobCategory(),
        val key: String = "",
        val location: Location = Location(),
        val max_possible_earnings_hour: Double = 0.0,
        val max_possible_earnings_total: Double = 0.0,
        val new_matches_count: Int = 0,
        val open_positions: Int = 0,
        val shifts: List<Shift> = listOf(),
        val title: String = "",
        val url: String = ""
)
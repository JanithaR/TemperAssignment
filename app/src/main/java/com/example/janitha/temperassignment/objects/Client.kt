package com.example.janitha.temperassignment.objects

data class Client(
        val avg_response_time_in_hours: Int = 0,
        val description: String = "",
        val id: String = "",
        val name: String = "",
        val photos: List<Photo> = listOf(),
        val rating: Rating = Rating()
)
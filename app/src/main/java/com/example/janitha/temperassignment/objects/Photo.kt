package com.example.janitha.temperassignment.objects

data class Photo(
        val created_at: String = "",
        val filetype: String = "",
        val formats: List<Format> = listOf(),
        val id: Int = 0,
        val owned_by_id: Int = 0,
        val owned_by_type: String = "",
        val updated_at: String = ""
)
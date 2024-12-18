package com.example.food2forkkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
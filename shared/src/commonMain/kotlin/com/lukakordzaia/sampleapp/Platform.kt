package com.lukakordzaia.sampleapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
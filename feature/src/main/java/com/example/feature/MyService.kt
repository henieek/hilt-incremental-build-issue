package com.example.feature

import javax.inject.Inject

class MyService @Inject constructor() {
    fun doStuff() {
        println("Hello!")
    }
}
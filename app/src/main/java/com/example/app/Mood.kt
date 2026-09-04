package com.example.app

abstract class Mood(val date: String) {
    abstract fun getMoodString(): String

    fun getDateInfo(): String {
        return "Date: $date"
    }
}

class Happy(date: String) : Mood(date) {
    override fun getMoodString(): String {
        return "I am happy!"
    }
}

class Sad(date: String) : Mood(date) {
    override fun getMoodString(): String {
        return "I am sad :("
    }
}

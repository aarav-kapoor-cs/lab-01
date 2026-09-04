package com.example.app

abstract class Pet(val name: String, var age: Int) {
    abstract fun speak(): String
}

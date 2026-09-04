package com.example.app

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val cat = Cat("Coco", 6)
        val dog = Dog("Mochi", 6)
        val scorpion = Scorpion("Matcha", 32)


        val pets = mutableListOf<Pet>()
        pets.add(cat)
        pets.add(dog)
        pets.add(scorpion)


        val pettablePets = mutableListOf<Pettable>()
        pettablePets.add(cat)
        pettablePets.add(dog)


        // Lab 1 Participation Exercise
        val happyMood = Happy("2026-09-03")
        val sadMood = Sad("2026-09-23")

        println(happyMood.getMoodString())
        println(sadMood.getMoodString())
    }
}

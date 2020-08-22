package com.example.myapplication

fun main(){


val meyveler = arrayOf<String> ("Karpuz", "elma", "armut", "kel mahmut")

    for(meyve in meyveler) {
        println("sonuc: $meyve")
    }

    for((indeks, meyve) in meyveler.withIndex()) {
        println("Sonuc: $indeks : $meyve")
    }

}
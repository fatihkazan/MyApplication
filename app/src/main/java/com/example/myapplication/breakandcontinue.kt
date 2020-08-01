package com.example.myapplication

fun main() {

    for (b in 1..5) {

        if (b == 3) {
            break
        }
        println("döngü1: $b")
    }

    for (a in 1..5) {
        if (a == 4) {
            continue
        }

        println("Döngü2: $a")
    }


}
package com.example.myapplication

import java.util.*
import kotlin.math.*
import kotlin.random.Random

fun main () {


   /* for ( i in 1..10){

        val rastgelesayi = Random.nextInt(0,10) // rastgele sayı oluşturma

        println(rastgelesayi)
    }
*/

    val c = ceil(6.5) // verilen değeri yukarı yuvarlar
    println("c : $c")

    val f = floor(6.5) // verilen değeri aşağı yuvarlar
    println("f : $f")

    val k = sqrt(4.0) // verilen değerin karakökünü alır.
    println("k : $k")

    val l = abs(-10) // verilen değeri mutlak değer dışına çıkarırr
    println("l : $l")

    val mx = max(100,200) // verilen değerin hangisinin büyük olduğunu gösterir
    val mn = min(100,200) // verilen değerin hangisinin küçük olduğunu gösterir
    println("max : $mx")
    println("min : $mn")


    val p = 2.0.pow(3.0) //verilen değerin üssünü alır.
    println("p : $p")

}
package com.example.myapplication

import java.util.*

fun main() {


    val girdi = Scanner(System.`in`)

    println("Lütfen Adınızı Giriniz")

    val isim = girdi.next() //rakam istemediğimiz için nextInt yazmadık

    println("Lütfen tekrar sayısını giriniz")

    val tekrar = girdi.nextInt()

    for (i in 1..tekrar) {
        println("$i. $isim") //nokta koyar isek rakamın yanına da nokta konur

    }

}
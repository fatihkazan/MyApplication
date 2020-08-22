package com.example.myapplication

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)

val isimler = Array<String> (5){""}

    for( i in 0 until isimler.count()){
        println("${i+1}. isim giriniz")
        val isim = girdi.next()

        isimler[i] = isim

    }

    for((indeks,isim) in isimler.withIndex())
        println("${indeks+1}. isim: $isim")






}
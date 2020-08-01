package com.example.myapplication

import java.util.*

fun main(){

val girdi = Scanner(System.`in`)

    println("Sil (1)")
    println("Düzenle (2)")

    val tercih = girdi.nextInt()

    when(tercih) {


        1 -> println("Veri silindi")
        2 -> println("Veri Düzenlendi")
        else -> println("Lütfen Geçerli bir sayı giriniz")
    }
}
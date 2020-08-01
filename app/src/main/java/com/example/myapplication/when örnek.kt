package com.example.myapplication

import java.util.*

fun main() {

    val girdi = Scanner(System.`in`)

    println("Toplama (1)")
    println("Çıkarma (2)")
    println("Çarpma (3)")
    println("Bölme (4)")

    val tercih = girdi.nextInt()


    // if (tercih==1 || tercih==2 || tercih==3 || tercih==4)
    println("Lütfen birinci sayıyı giriniz")
    // else
    //println("Lütfen geçerli bir sayı giriniz")
    val sayi1 = girdi.nextInt()

    println("Lütfen ikinci sayıyı giriniz")

    val sayi2 = girdi.nextInt()

    when (tercih) {

        1 -> println("Toplam: ${sayi1 + sayi2}")
        2 -> println("Çıkarma: ${sayi1 - sayi2}")
        3 -> println("Çarpma: ${sayi1 * sayi2}")
        4 -> println("Bölme: ${sayi1 / sayi2}")
        else -> println("Böyle bir işlem yok")
    }


}
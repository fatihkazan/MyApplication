package com.example.myapplication

import java.util.*

fun main() {


    val girdi = Scanner(System.`in`)

    var toplam = 0

    while (true) {
        println("sayı giriniz:")
        var sayi = girdi.nextInt()

        if (sayi == 0)
            break
        else if (sayi != 0)
            toplam += sayi

    }

    println("girdiğiniz sayıların toplamı: $toplam")

}

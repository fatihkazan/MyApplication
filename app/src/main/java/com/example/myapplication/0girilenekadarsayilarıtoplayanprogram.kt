package com.example.myapplication

import java.util.*

fun main() {


    val girdi = Scanner(System.`in`)


    var toplam = 0


    /* while (true) {

         println("sayı giriniz:")
         val sayi = girdi.next().toIntOrNull()

         if (sayi == null) {
             println("rakam gir")
         } else if (sayi == 0) {
             break
         } else {
             toplam += sayi
         }
     }

     println("girdiğiniz sayıların toplamı: $toplam")*/


    fatih@ while (true) {

        println("sayı giriniz:")
        val sayi = girdi.next().toIntOrNull()

        when (sayi) {

            null -> println("rakam gir")
            0 -> break@fatih
            else -> toplam += sayi

        }
    }

    println("girdiğiniz sayıların toplamı: $toplam")

}

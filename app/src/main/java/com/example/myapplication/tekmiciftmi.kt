package com.example.myapplication

import java.util.*

fun main() {

    //Örnek: Sayı giriniz
    // 10
    //Çift sayıdır.
    // çıkmak için (1)-Devam etmek için diğer sayıları kullanın
    //2
    //sayı giriniz
    //5
    //tek sayıdır
    //çıkmak için (1)-Devam etmek için diğer sayıları kullan
    //1
    //çıkış yapıldı.

    val girdi = Scanner(System.`in`)

    while (true) {

        println("Sayi giriniz")

        val sayi = girdi.nextInt()

        val sonuc =
            sayi % 2 //yüzde işareti moddur. bir sayıyı 2 ye böler. Tek sayılarda Kalan sonucuna bakılır.

        if (sonuc == 0) {
            println("Çift sayıdır")
        }

        if (sonuc == 1) {
            println("Tek sayidir")
        }

        println("Çıkmak için (1) - Devam etmek için sayı giriniz")

        val cıkıs = girdi.nextInt()

        if (cıkıs == 1) {

            println("Çıkış yapıldı")
            break
        }
    }


}
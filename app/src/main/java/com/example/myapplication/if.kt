package com.example.myapplication

fun main() {


    var yas = 19
    var isim = "xy"

    if (yas >= 18) {
        println("Reşitsin")
    } else {
        println("Reşit Değilsiniz")

        if (isim == "Fatih") {
            println("Selam Koç")
        }
    }

    if (isim == "Fatih") {
        println("Merhaba Fatih")
    } else if (isim == "Kerim")
        println("Selam Kerim")
    else {
        println("Sen kimsin lan?")
    }

    //And'li örnek

    var kullanici = "admin"
    var sifre = 1234

    if (kullanici == "admin" && sifre == 12345)
    println("Hoşgeldiniz")
    else
    println("Şifre veya parola yanlıs")


   // örnek 6 çoklu şart or

    var sinif = 10
    if (sinif == 9 || sinif== 10 || sinif== 11 || sinif == 12){
        println("Ayt kazandınız")}


    //örnek 7 kısaltma

    var a = 10
    var b= 13

    if ( a == b) println("Eşit") else println ("Eşit Değil")
    }



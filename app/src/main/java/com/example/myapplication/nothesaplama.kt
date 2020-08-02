package com.example.myapplication

import java.util.*

fun main() {
    //* vize notunuzu giriniz
    // not girildi
    //final notunuzu giriniz
    //not girildi
    // ortalamanız:... Notunuz: A


    var girdi = Scanner(System.`in`)

    println("Vize notunuzu giriniz:")

    var vize = girdi.nextDouble()

    println("Final notunuzu giriniz:")

    var final = girdi.nextDouble()

    val ortalama = (vize / 100) * 40 + (final / 100) * 60

    println("Dönem sonu notunuz: ${ortalama.toInt()}")


    if (ortalama > 100) {
        println("Geçersiz hesaplama")
    } else if (ortalama >= 80 && ortalama < 100) {
        println("Dönem Sonu notunuz (A)")
    } else if (ortalama >= 60 && ortalama < 80) {
        println("Dönem sonu notunuz (B)")
    } else if (ortalama >= 40 && ortalama < 60) {
        println("Dönem sonu notunuz (C)")
    } else if (ortalama >= 20 && ortalama < 40) {
        println("Dönem sonu notunuz (F)")
    } else if (ortalama >= 0 && ortalama < 20) {
        println("Dönem sonu sonucunuz(FF)")
    } else if (ortalama < 0) {
        println("Geçersiz ifade")
    }


}












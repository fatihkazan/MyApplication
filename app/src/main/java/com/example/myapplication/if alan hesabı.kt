package com.example.myapplication

import java.util.*

fun main(){

//NOt: Aşağıdaki kod, konsoldan girdi almaya yarayan yapı.
    val girdi = Scanner(System.`in`) // Önce bu kod oluşturulur Girdi alabilmek için.

    println("Dikdörtgen alanı (1) ")
    println("Çember alanı (2)")

    val secim = girdi.nextInt()
    println("Seçiminiz : $secim")

    if (secim ==1){
        println("Kısa Kenarı giriniz")
        val kısakenar = girdi.nextInt()

        println("Uzun kenarı giriniz")

        val uzunkenar = girdi.nextInt()

        println("Dikdörtgen alanı")

        val dikdörgenalani= kısakenar * uzunkenar
        println("Sonuç = $dikdörgenalani")

    }

    if (secim  == 2){

        println("Yarı çap giriniz")

        val yaricap= girdi.nextInt()

        println("Çember Alanı")

        val cemberAlani = 3.14 * yaricap * yaricap

        println("Sonuç $cemberAlani")


    }
}
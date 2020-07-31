package com.example.myapplication

import java.sql.SQLTransactionRollbackException

fun main() {

    //var ad = "Fatih"
    //var yas = 10

    //println("$ad istanbulda $yas yıldır yasıyor")

    var ürünAdi = "Nike"
    var ürünadedi = 50
    var ürünfiyat = 500.00
    var tedarikci = "Fatihspor"

    println("Ürün adı = $ürünAdi")
    println("Ürün adedi = $ürünadedi")
    println("Ürün fiyatı = $ürünfiyat")
    println("Ürün Tedarikçisi = $tedarikci")

    println("$ürünAdi adlı üründen $ürünadedi adet elimizde olup $ürünfiyat TL fiyatı vardır $tedarikci her zaman hizmetinizdedir.")


    var a = 10
    var b = 5

    println("$a ve $b 'nin çarpımı : ${a*b}")

    var fiyat = 15

    println(fiyat)

    fiyat = 20

    println(fiyat)


    var s1 = 10
    var s2 = 20

    var toplam = s1+25

    println(toplam)



}
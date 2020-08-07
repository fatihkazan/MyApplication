package com.example.myapplication

import java.util.*

fun main() {
    //* vize notunuzu giriniz
    // not girildi
    //final notunuzu giriniz
    //not girildi
    // ortalamanız:... Notunuz: A


    val girdi = Scanner(System.`in`)


    //val vize = girdi.next().toDoubleOrNull()
    var vize: Double? = null
    // vize = girdi.next().toDoubleOrNull()
    while (vize == null) {
        print("Vize notunuzu giriniz: ")
        vize = girdi.next().toDoubleOrNull()

        if (vize == null) {
            println("geçerli bir sayı girin")


        } else if (vize !in 0.0..100.0) {
            println("100 ile 0 arası sayı gir")

            vize = null


        }
    }


    // else if()
    //println("Vize Notunuzu giriniz")


    print("Final notunuzu giriniz: ")

    val final = girdi.next().toDoubleOrNull()

    if (final == null || final !in 0..100) {
        println("Geçerli sayı gir")
        return

    }


    val ortalama = ((vize / 100) * 40 + (final / 100) * 60).toInt()

    println("Dönem sonu notunuz: $ortalama")

    /* val not = if (ortalama in 80..100) {
 "A"
} else if (ortalama in 60 until 80) {
 "B"
} else if (ortalama in 40 until 60) {
 "C"
} else if (ortalama in 20 until 40) {
 "D"
} else if (ortalama in 0 until 20) {
 "F"
} else {
 ""
}

*/

    val not = when (ortalama) {
        in 80..100 -> "A"
        in 60 until 80 -> "B"
        in 40 until 60 -> "C"
        in 20 until 40 -> "D"
        in 0 until 20 -> "F"
        else -> ""
    }


    if (not == "") {
        println("Not geçersizdir")
    } else {
        println("Dönem Sonu Harfiniz: $not")
        return
    }


    /* if (ortalama > 100) {
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
 }*/


    /*if (ortalama > 100) {
    println("Geçersiz ifade")
} else if (ortalama >= 80) {
    println("Dönem sonu notu (A)")
} else if (ortalama >= 60) {
    println("Dönem Sonu notunuz (C)")
} else if (ortalama >=40) {
    println("Dönem sonu notunuz (D)")
} else if (ortalama >=20) {
    println("Dönem sonu notunuz (F)")
}else if(ortalama>=0) {
    println("Dönem sonu notunuz (FF)")
}else
    println("Geçersiz ifade")*/

    /* if (ortalama > 100) {
     println("Geçersiz hesaplama")
 } else if (ortalama in 80..100) {
     println("Dönem Sonu notunuz (A)")
 } else if (ortalama in 60 until 80) {
     println("Dönem sonu notunuz (B)")
 } else if (ortalama in 40 until 60) {
     println("Dönem sonu notunuz (C)")
 } else if (ortalama in 20 until 40) {
     println("Dönem sonu notunuz (F)")
 } else if (ortalama in 0 until 40) {
     println("Dönem sonu sonucunuz(FF)")
 } else {
     println("Geçersiz ifade")
 }*/


}












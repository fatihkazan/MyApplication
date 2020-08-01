package com.example.myapplication

fun main() {

    var i: Int = 42
    var d: Double = 42.0
    var f: Float = 42.0f

    var sonuc1: Int = d.toInt()
    var sonuc2: Double = i.toDouble()
    var sonuc3: Int = f.toInt()

    println(sonuc1)
    println(sonuc2)
    println(sonuc3)

    //yöntem1

    var yazi1 = "34t"

    try {

        var x = yazi1.toInt()

    } catch (e: Exception) {
        println("Dönüşümde hata var")
    }

    //yöntem 2

    var yazi2 = "45.56t"

    var y = yazi2.toDoubleOrNull()

    if (y != null) {
        println("y : $y")
    } else {
        println("Dönüşümde hata var")


    }

    //yöntem 3

    var yazi3 = "67t"

    var z = yazi3.toIntOrNull()

    z?.let {

        println("z: $z")
    }
}
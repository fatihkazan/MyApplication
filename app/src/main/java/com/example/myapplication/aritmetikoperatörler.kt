package com.example.myapplication

fun main() {

    //daire alanı

    val pi = 3.14

    var yariçap = 2.14

    var alan = pi * yariçap * yariçap

    println("Darinenin alanı = $alan")

    // F = m x a

    var m = 12.5
    var a = 10.0

    var f = m * a
    println("F = $f")

    //Ax

    var v = 12.7
    var y0 = 23.56
    var t = 3.5

    var x = ((v + y0) / 2) * t

    println("x = $x")

    var x2 = (y0 * t) + (a * t * t) / 2

    println("x2 = $x2")

    //kısaltma

    var y = 10

    y = y + 2

    println(y)

    y += 2

    println(y)

    y -= 3

    println(y)

    y *= 4

    println(y)
}
package com.example.myapplication

fun main(){

    //3 ile 6 arası çalışan for örneği

    for(a in 3..6){
        println("A: $a")
    }

    var baslangic = 3
    var bitis = 6
    var artis = 1

    for(b in baslangic..bitis step artis)
        println("b: $b")

    //while ile örnek

    var sayac = 3

    while(sayac < 7) {
        println("Sayac: $sayac")
        sayac += 1
    }

    //0 ile 8 arası 2 şer artım

    for (a in 0..8 step 2) {
        println("A: $a")
    }

    var saya = 0

    while(saya < 9) {
        println("sayac: $saya")
        saya += 2
    }

    //8 den 0 a 2 şer azalsın

    for(c in 8 downTo 0 step 2){
        println("C : $c")
    }

    var say = 8
    while(say> -1 ){
        println("Say: $say")
        say -= 2
    }
}

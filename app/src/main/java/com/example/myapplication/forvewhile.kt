package com.example.myapplication

fun main(){


    for ( i in 3..5){
        println(i)
    }


    //10 ile 20 arası 5 er artsın

    var baslangic = 10
    var bitis = 20
    var artis= 5

    for (a in baslangic..bitis step artis)

        println(a)

    // 20 den 10'a 2 şer azalma

    for(b in 20 downTo 10 step 2) {
        println("b: $b")
    }

    for(l in 1 until 5){
        println("l: $l")
    }

    //Notlar: step: artış miktarını belirler
    // downTo yüksek sayıdan alçak sayıya azaltırken kullanılır
    // until: Belirli sayılar arasındaki rakamlardan son rakamı dahil etmez ör:1..5(5 dahil olmaz)

    var sayac = 1

    while (sayac < 4){
        println("Sayac : $sayac")
        sayac += 1 //sayac= sayac +1 şeklinde de yazılabilirdi.

    }

}
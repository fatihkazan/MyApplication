package com.example.myapplication

import androidx.core.content.contentValuesOf

fun main(){

// diziler 0'dan başlar.

    val meyveler = arrayOf<String> ("elma", "armut", "mahmut")

    val str1 = meyveler.get(2)
    println(str1)

    val str2 = meyveler [1]
    println(str2)


    meyveler [1] = "çürük armut"

    println(meyveler.contentToString())


    meyveler.set(0, "yeşil elma")
    println(meyveler.contentToString())


    //array işlemleri

    println(meyveler.isEmpty()) // dizi dolu mu boş mu diye sorduk.

    println(meyveler.count())// dizide kaç eleman var sorduk

    println(meyveler.first()) // dizideki ilk elemanı verir

    println(meyveler.last()) // dizideki son elemanı verir

    println(meyveler.indexOf("mahmut")) // dizideki elemanın kaçıncı sırada oluğunu sorduk.

    println(meyveler.contains("coni")) // tırnak içindeki eleman dizide var mı yok mu diye sorduk varsa true yoksa false döner.

    println(meyveler.max()) // en büyük değeri verir

    println(meyveler.min()) // en küçük değeri verir

    println(meyveler.sort())
    println(meyveler.contentToString()) // küçükten büyüğe doğru sıralar

    println(meyveler.reverse())
    println(meyveler.contentToString()) // diziyi tersine çevirir.
}
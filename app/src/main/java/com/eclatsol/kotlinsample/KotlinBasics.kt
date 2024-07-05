package com.eclatsol.kotlinsample

fun main() {

    val kb = KotlinBasics(b = 15)
    println("The Integer is ${kb.someInt}")
//    println("The sum is: "+KotlinBasics(5).add(4,5))
//    println("The sum is: "+KotlinBasics(5).add(4,5)) //KotlinBasics().add() use karvathiMemory ma space vadhare le che
    //ek single variable ma object ne assign kari devo val kb = KotlinBasics()
    println("The sum is ${kb.add(4, 5)}")

//    val kct = KotlinClassTwo(5)

    KotlinClassTwo(b=5) //Value assign into b parameter
    KotlinClassTwo(b = 15, c = 20, a = 30)
    KotlinClassTwo(b = 25, c = 40)

}

class KotlinBasics(a: Int = 100, b : Int = 200) { //constructor keyword no tame use kari shako primary Constructor che //Default value assign in primary constructor
    var someInt = 10

    init {
        val sum = a + b
        println("Addition of two $sum")
        println("We are getting a : $a")
    }

    fun add(a: Int, b: Int): Int {
        return a + b
    }
}

class KotlinClassTwo {

//    constructor(a: Int, b: Int) {
//        val sum = a + b
////        println("Addition of two is: " + sum)
//        println("Addition of two is: $sum")
//    }

    constructor(a: Int = 100, b: Int = 200) { //This is default value
        val sum = a + b
//        println("Addition of two is: " + sum)
        println("Addition of two is: $sum")
    }

    constructor(a: Int = 100, b: Int = 200, c: Int = 300) {
        val sum = a + b + c
//        println("Addition of three is " + sum)
        println("Addition of three is $sum")
    }
}
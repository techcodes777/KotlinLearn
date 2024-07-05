package com.eclatsol.kotlinsample

fun main() {
    highOrder(5, 6, printMe)
    order(printMe)
    highAdd(sum)

    HighOrderFunction(printMe)
    println(number(sum))
    println(addStringData(sum))
    println(numberData(5, 6) { a: Int, b: Int -> a + b })
}

val printMe =
    { println("This line has been printed!") } //Kai expect(argument) nathi kartu //Kai return nathi kartu

val sum = { a: Int, b: Int -> a + b }

val strNew = { a: Int, b: Int -> "The sum is: " + { a + b } }

val retFun = {5}

class HighOrderFunction(func: () -> Unit) {
}

fun order(a: () -> Unit) { //Normal higher-order function che
    println("Order Function")  //te na to arrgument le che //Na to te return kare che koi value
    a()
}

fun highOrder(a: Int, b: Int, c: () -> Unit) {
    println("The sum of two value $a + $b = ${a + b}") //Predefine Function Banavelu che
    c() //Function ni andar function call karva mate function na name pasi method invokation no use karvo
}

fun highAdd(func: (Int, Int) -> Int) { //This is Input Lambda Expression
    println("The sum is ${func(5, 6)}")
}

fun number(func: (Int, Int) -> Int): () -> Int {
    println("The sum is ${func(5, 10)}")
    return retFun
}

fun addStringData(data : (Int,Int) -> Int): (Int, Int) -> String {
//    data(5, 10)
    return strNew
}

fun numberData(a: Int, b: Int, operate: (Int, Int) -> Int): Int {
    return operate(a, b)
}

val good : (Int,Int) -> Int = {a,b->a+b}
val nice : (String) -> String = {a -> "Good"}
val very = { println("Good") }
val short = {ab : Int -> 15}

fun datas(func : () -> Unit){

}
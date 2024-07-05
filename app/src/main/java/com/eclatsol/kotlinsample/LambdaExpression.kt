package com.eclatsol.kotlinsample

fun main() {

    println("The square of 2 is: " + square(5)) //Simple rite apne atyare karu
    println(sqr(5))
    println(number(10))
    println("The sum is : ${addd(25, 25)}")
    println(twoData("Hello", "Good morning"))
    println(booleanData(true))
    println(addData())
    println(noteData())
    println(numberData(15))
    println("This is wonderful data: ${continueData(15, 15)}")
    println(print())
    println(stringData("Jemis"))
    println(stringNewData("AllData"))


    printName()
    printData //Function na reference(Variable call karvi shavi)
    printData() //Function ne call karva mate variable pachal method invokation nu jarur pade che
    allNumber(10)
}


var num: Int = 11 //Kotlin automatically identify kari le che value ne kya type ni value che
//Lambda expression thhi karishu

//var data = {p -> p * p}//lambda expression ma p identify nathi thato to type devi pade input output ma

val sqr: (Int) -> Int =
    { j -> j * j }  //Lambda Expression use kari tame code short kari shako shavo //code consice thay jay che

val number = { p: Int -> p * p }//Code concise thay gayo short thay gayo

val allNumber = { nums: Int -> nums * nums } //Self define che Self Define no matlab tenu koi name nathi hotu//Integer value return kare che

//Two value ne add karvi che
val add: (Int, Int) -> Int = { a, b -> a + b }

val addd: (Int, Int) -> Int = { m, n -> m + n }

val twoData: (String, String) -> String = { o, t -> "Hello" + " World!" }

var boolData: Boolean = true

val booleanData: (Boolean) -> Boolean = { p -> boolData }

val printName = { println("Hello,Android Devs") }

val printData: () -> Unit = { println("Good Morning") }

val noteData: () -> Unit = { "Good Morning" }

val addData: () -> Unit = { println("How are you?") }

val numberData: (Int) -> Int = { 240 }

val continueData: (Int, Int) -> Int = { d, y -> d + y }

val print = { println("Very Good")}

val stringData: (String) -> Unit = { strName -> println("Hello, " + strName) } //Return karshe unit kuch bhi nahi

val stringNewData = { strName: String -> println("I am always be happy " + strName) }

class LambdaExpression {
}

fun square(a: Int): Int {
    return a * a //Simple normal function che
}
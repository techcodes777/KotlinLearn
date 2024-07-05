package com.eclatsol.kotlinsample

fun main(){
    val number = 5
    val num : Int?
    num = 0 //val ma ek j value store thashe //Multiple time value ovverride nahi kari shako //Reassign nahi kari shako //val final ni jem kam kare che //ek value assign kari dithi passi biji value override nathi thati

    //Value ne override karvi che reassign arvi che to var no use karish
    println("$num")
    val kotlinBasics = KotlinBasicSyntax()
    val sum = kotlinBasics.Add(10,10)
    println("The sum is $sum")
    println("The sum is ${kotlinBasics.Add(10,10)}")
}
class KotlinBasicSyntax {

    fun Add(a : Int,b : Int) : Int {
        return a+ b
    }

}
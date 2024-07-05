package com.eclatsol.kotlinsample

fun main(){

    val interFace1 = InterFaceClass()
    val interFaceClassB =  InterFaceClassB()
    println("The no. is: ${interFace1.firstNo} , ${interFaceClassB.firstNo}")
    println("The sum of two no. is: ${interFace1.Add(5,6)}, ${interFaceClassB.Add(6,6)}")
    println("The sum of three no. is: ${interFace1.Add(5,6,7)}, ${interFaceClassB.Add(5,6,7)}")
}

class InterFaceClass : Add{

    override var firstNo: Int = 50

//    override var firstNo: Int
//        get() = TODO("Not yet implemented")
//        set(value) {}

    override fun Add(a: Int, b: Int): Int {
        return a + b
    }

    override fun Add(a: Int, b: Int, c: Int) : Int {
        return a + b + c
    }
}

class InterFaceClassB : Add{

    //Interface eke basic structure che
    //Interface ma only attribute declare karvama ave che //Tene define(Implement) biji jagyaye karva ma ave che (Class ma) implement karvi shavi colon thi
    override var firstNo: Int = 20

    override fun Add(a: Int, b: Int): Int {
          return  a+a+b+b
    }

    override fun Add(a: Int, b: Int, c: Int): Int {
          return 3*(a+b+c)
     }

}

interface Add{

    var firstNo : Int

    fun Add(a : Int, b : Int) : Int

    fun Add(a : Int,b : Int,c : Int) : Int
}
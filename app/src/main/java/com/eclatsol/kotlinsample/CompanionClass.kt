package com.eclatsol.kotlinsample


fun main(){
    println("Hello,Good Morning")


    CompanionClass.secondNo = 50 //Static Allocation //CompileTime Memory Allocation// Before Program Execute Memory Allocation
    println("${CompanionClass.secondNo}")
    println("${CompanionClass.addData(50,50)}")

    CompanionClass().firstNo =  60 //Runtime Allocation //Runtime memory allocation //First create object and then access reference va
    //() bracket on and close //it is method invocation
}


class CompanionClass {
    var firstNo = 18

    fun product(a : Int , b : Int) : Int{
        return  a * b
    }

    companion object{
        var secondNo  = 25

        fun addData(a : Int , b : Int) : Int{
            return a  + b
        }
    }
}
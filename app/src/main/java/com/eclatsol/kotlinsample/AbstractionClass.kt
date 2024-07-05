package com.eclatsol.kotlinsample

fun main(){

    val myClassOne = MyClassOne()
    println("The name is ${myClassOne.name}")
    println("The number is  ${myClassOne.branch}")
    println("The sum of two number ${myClassOne.Add(5)}")
}

interface IClass{
    var operator : String

    fun square(a : Int) : Int

//    fun square(a : Int) : Int{
        //return a*a //Tame default definition pan api shako shavo most of cases ma tame declaration use karo shavo
        //Tame bija class ma definition nathi use karta to
        //Square ma changes karo cho to tema chnage thahshe //Square ma chnage mathi karta to  //Class override  method ma change kari shako

    //By Default hovi joi tare definition apo shako shavo
     //Default nathi banavata tp method oveeride kari padshe class ma
  //  }
}

abstract class AbstractionClass {
    var name : String = "John" //Non-abstract attribute,member,variable,property

    fun Add(a : Int) : Int{ //Non-abstract method //Method ni definition define che //Method ni body define che
        return a+a
    }

    abstract var branch : String //Abstract attribute, Abstract variable

    abstract fun operate(a : Int, b : Int) : Int//Abstract function,Abstract function

}

class MyClassOne : AbstractionClass(){
    override var branch: String = "Computer"
//    override var branch: String
//        get() = TODO("Not yet implemented")
//        set(value) {}

    //val abstractionClass = AbstractionClass() //cannot be initiated //cannot be create object
    override fun operate(a: Int, b: Int) : Int{
        return a + b
    }

}

class  NewClass : IClass{
    override var operator: String = "Add"

    override fun square(a: Int): Int {
        return a*a*a
    }
}
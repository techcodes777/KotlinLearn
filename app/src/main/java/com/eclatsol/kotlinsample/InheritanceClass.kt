package com.eclatsol.kotlinsample


fun main() {

    val person = Person() //()This method(constructer) invocation //Create object class
    val inheritanceClass = InheritanceClass()
    println("The Name is: " + person.name  + ", " + inheritanceClass.name)
    println("The Sum is: " + person.Add(5,6) + ", " + inheritanceClass.Add(5,6))
}

class Person : InheritanceClass() { //Child Class ,Sub Class, Name Class

//    override var name: String
//        get() = super.name
//        set(value) {}
    //get and set pan kari shako

    //Inheritanc biological word che
    override var name: String = "Harry"

    override fun Add(a: Int, b: Int): Int { //Runtime polymorphisom kahvay che //Method Overriding pan kahay che //Rum time per method ni definition change karvi che ,Feature Same che ,Logic Different che
        val sum = super.Add(a, b) //Super keyword no matlab parent ni property ne access kari shakvi //Aa property super class ni che
        val squ =  sum * sum// Inline no matlab directly el line ma return kari devu
        return sum * sum
    }
}

open class InheritanceClass { //This is ParenClass,Super class, Surname Class
    //Kotlin class (File) by default final hoi che tene inherite karva mate open keyword no use karvo pade pasi j inherite thay
    open var name = "John"  //By Default Final hoi che

    open fun Add(a: Int, b: Int): Int { //Compiletime polymore phisom che  //Method overloading kahvey che
        return a + b   //Function by Default Final hoi che //Override karva mate open keyword no use karvo pade che
    }
}
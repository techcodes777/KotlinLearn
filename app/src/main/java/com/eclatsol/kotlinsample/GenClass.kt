package com.eclatsol.kotlinsample

fun main(){

    val genClass = GenClass<String>("Hello")
    checkData(true)
}

class GenClass<T>(value : T) { //This is primary constructor //This is not normal class //it is T(anotation) Type Specifice class che

     init {
         println("The value is: $value")
         //checkData<String>(value) //Cannot be pass value //kem ke type string che //String type ne remove karvi apde
         checkData<T>(value)//Any Type Specify //Any Value pass //Runtime per koi pan value avi shake che
         checkData<Int>(1)//Specific Type //Integer type ni value ave che
         checkData("Hello World")//Type mention karvani jarur nathi<>LessThan-GraterThan ma Triangle Bracket ma//Kotlin automatic identify kai le string value pass thay che
     }
}

fun <T> checkData(value : T){
    println("Received value is: $value")
}
fun <T> checkAllData(value : T){
    println("You are right")
}

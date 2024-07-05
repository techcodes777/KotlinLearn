package com.eclatsol.kotlinsample


fun main() {

//    val userData = User()
//    userData.name = "Modi"
//    userData.age = 20         //Without using scope function
//    userData.mobNo = "15151"
    var name : String? = null
    var name1 : String = ""
    var name2 : String

    //name = "Jemis" //Varable ma value assign hashe tyare j let scop function no anadar code execure thashe
  //  println("The length of name is : ${name!!.length}") //Compiler give me error null pointer exception
    name?.let { //Object reference(Property)it male che //name it thi male che//context name it thi male chr
        println("The name  ${name!!.length}")//jayre name no use kari shavi tyare (!!) Non-null assertion ni jarur pade che
        println("The length of name is : ${it.length}") //it ma non-null assertion(!!) ni jarrur nathi
        println("The name is $it") //Directly it no use kari shakvi
        println("The reversed name is ${it!!.reversed()}")
    }
    //let scope function ma scopresultion ma code tyare execute thashe jay value assign hoi
    //Jo value assign nahi hoi to ecope resolution ni andar line execute nahi thay
    //Pela apne badhi functionality name per karta hata have apne badhi functionality let scop function context object it per karvi shavi
    //it refer kare che name ne //let no use kari shavi te null safe che

    val user = User().apply { //User ni value ni print karava mate object create karvi shavi shavi
        name = "John"
        age = 25              //With Scope Function
        mobNo = "1559515"
//        this.name = "How are you?"
        // Return : context object
        //Context object : this
    }
//    println("The name of user is: " + user.name)

    val ages  = with(user) { //Object no reference this thi male che //this keyword no use karo toi chalshe //This keyword no use nahi karo to pan chalshe

        println("The name of user is: $name")
        age   //with lambdafunction return kare che
        //Return : Lambda Result
        //Context object : this
    }
    println("The age of user is: $ages")

    user.also { //Object no reference it thi male che //Tame property ni valur ne change kari shako shavo
        it.name = "PMMODI"  //Directly tame name ne (Property) ne use nahi kari shako //Use karva mate it no use karvo padshe
        println("The name has changed!")  //this keyword no use nahi thay
        //println("The name has changed! $it")  //also direct it ne use nathi kari shakta
    }

    println("The name is: ${user.name}") //scope ma vadharo thayo che

    val user1 : User? = null //null che object create kato nahi

    val msg = user1?.run {//Code execute karvo che //Null check karvu che tyare run no use thay che //With + Let = Run thay che
        println("The name of user is ${name!!.length}")
        age //direct access kari shako //this keyword no use kari ne pan access kari shako
        "Run Scope Function"//Last statement hameshs return statement kahvay che //Automatically type identify kari le kotlin return shu kare che
    }
    //Return : Lambda Result
    //Context object : this
    println("Msg is $msg")
}

class User {
    var name: String? = "Jemis Virani"
    var age: Int? = 370
    var mobNo: String = "80515555414"
}

class ScopeFunctionClass {
}
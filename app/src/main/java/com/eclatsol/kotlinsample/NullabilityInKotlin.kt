package com.eclatsol.kotlinsample

fun main(){

    var name : String? = null //Call Safe ?(Question Mark) nahi lagavo to tame null ne hold nahi kari shako
    // Variable null value accept kare na to compile time error avshe nato runtime error avshe
    //? no matlab null value avi shake che
//    name = "John"
    name = "Jemis"
    println("${name!!.length}") //Jo value null hashe to runtime erro apshe null pointer exception //Value assign che to null nahi ape
    //Java ma pane try catch no use karv padto hato
    //Kotlin ma pele thi define che null value avshe to Questionmark lagavishu //Null value nahi to question mark nahi lagavi
    //Runtime value point kare null kare che

    //Double exlamation mark no matlab runtime per koi value assign thavani che
    //Double exlmation mark hu atle lagavu shu ke mare te code ne execute karavo che //name ni length execute karavi che
    //By default null value che variable tya tame koi operation perform nahi kari shake
    //Compile time erro resolve thai jashe run time erro avshe

    //Question mark matlab e pan che jo tame variable declare karelo che null value avi shahke em che to tame question mark lagavi shako shavo
    //Question mark lagavathi nullpointer exception nahi ave
    //kotlin automatically handle kari le che null ne

    name?.let {//Null Safe kari shako code ne
        println("${name!!.length}")
    }
}

class NullabilityInKotlin {


}
package com.eclatsol.kotlinsample


fun main() {

    val audi = Audi(7777)
//    audi.interior(1234)
}

open class Car(chasisNo: Int) {
    //Basic Entities of Car

    init {
        println("ChasisNo is: " + chasisNo)
    }

    var manufacturerNo = 101010
    fun pressBrakes() : String{
        println("Car has been Stopped ")
        return "Breaks Pressed"
    }

    fun pressAccln(speed : Int) : String{
        println("Car acclerated with " + speed + "km/hr speed")
        return "Car Accelerated!"
    }

    fun changeGear(gearNo : Int) : String{
        println("Gear shifted to " + gearNo)
        return "Gear Shifted!"
    }
}

class Audi(chasiNo : Int) : Car(chasiNo) {

//    var chasisNo = 10000

    init {
        println("Audi Created " + manufacturerNo)
        println("Step1: " + super.changeGear(1))
        println("Step2: " + super.pressAccln(10))
        println("Step3: " + super.changeGear(2))
        println("Step3: " + super.pressBrakes())
    }

//    fun interior(chasisNo: Int) {
//        println("ChasisNo is: " + this.chasisNo) //This  (this.chasisNo) keyword //Current class na variable ne access kare che
//    }
}
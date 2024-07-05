package com.eclatsol.kotlinsample

fun main() {

    println("Today is: ${EnumDay.WEDNESDAY}")
    println("Tomorrow is: ${EnumDay.THURSDAY}")
    println("Direction is: ${Direction.NORTH}")
    println("Gender is: ${Gender.MALE}")

    for (day in EnumDay.values()) {
        if (day.holiday) {
            println(" $day is a Holiday!")
        }
    }
    //Enum is kind of user define datatype //te ek universal typ che
}

enum class EnumDay(val holiday: Boolean = false) { //Koi pan value pass kari shako
    SUNDAY(true),
    MONDAY,
    TUESDAY,
    WEDNESDAY(true),
    THURSDAY,
    FRIDAY,
    SATURDAY(true)
}

enum class Direction {
    NORTH, SOUTH, EAST, WEST   //Diffrentciate karva mate capital name lakhela small pan lakhi shako savo
}

enum class Gender {
    MALE, FEMALE, OTHER
}
package com.eclatsol.kotlinsample

class MyKotlinClass {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello World")

            //Data Type
            Int
            Long
            Float
            Double
            Boolean
            Char
            Short
            Byte
            String

            val a: Int = 7

            val name: String = "Jemis"

            var b: Int = 5 //Var can be assign //mutable

            val name1 = "Modi" //Val cannot be reassign //immutable

            //b = 5
            //String Template
            println("Hello $a Welcome to Kotlin $name $b")

            println(name1)

            //Access modifire only use in kotlin private keyword //all method by default public hoi che
            //protected no use karvo hoi to mainclass(static main)method sivay tame biji koi pan kotlin class ma open keyword no user kari shako

            println("The sum is ${addSum(4, 5, 10)}")

            //if,else if,else,switch statement // Conditional statement che //Kotlin ma switch navi ave when statement ave

            var num = 11

            var msg = ""

            msg = if (num > 100) "No. is greater" else "No. is smaller" //Ternnary If eler say kahvay che
            println(msg)

//            if (num > 100)
//                println("No. is greater") //single line code //wihlot cully bracket use if else statement
//            else
//                println("No. is smaller")

            if (num>100){
               println("No. is greater")
            }else if(num<70){
               println("No. is smaller")
            }else if(num==100){
               println("Number is equal")
            }else{
               println("Nothing")
            }

            when(num){
                1 ->{
                    println("No. is one")
                }
                100->{
                    println("No .is 100")
                }else ->{
                    println("Nothing")
                }
            }

            when {
                num>100 ->{
                   println("No. is Greater")
                }
                num<70 ->{
                    println("No. is smaller")
                }
                else ->{
                    println("Nothing")
                }
            }

            val num2 = when(num){
                10->{
                    "Ten"
                }
                20 ->{
                    "Twenty"
                }
                in 21..50 ->{
                    "Twenty one to fifty"
                }
                else ->{
                    "Nothing Number"
                }
            }

            println(num2)

            var nums = 0
            for(i in 1..10){
                println("Number is ${nums++}")
            }

            for(i in 0 until 10){
                println("Number is $i")
            }

            for(i in 10 downTo 0){
                println("Number down to is $i")
            }

            for(i in 0..10 step 3){
                println("Number is $i")
            }

            val arrayList = ArrayList<Int>()
            arrayList.add(1)
            arrayList.add(255)
            arrayList.add(3)
            arrayList.add(4)
            arrayList.add(5)

            for (i in arrayList){
                println("ArrayList $i")
            }

            var num3 = 10
            while (num3>10){
                println("While loop number is ${num3++}")
            }
            val num4 = 10
            do{
                println("Do while loop $num4")
            }while (num4>10)


            //Pair in Kotlin
            val (ab,cd) = Pair("A",true) //any value store in pair
            println("Pair is $ab,$cd")

            val name5 = Pair("B",Pair("C",3)) //Multiple nested pair banavi shako shavo
            println("Pair is ${name5.first} ${name5.second}")

            val name6 = Pair("D",Pair("E",Pair("F",5)))
            println("Nested Pair ${name6.first},${name6.second.second.first}")

            val name7 = Triple("Hello",2,Triple("Good",Triple("Morning",5,10),"Nice"))
            println("Triple ${name7.first}${name7.third}")

            val (p,q,r) = Triple("Good","Morning","Good")
            println("Triple is $p,$q,$r")

            val num6 = Triple("Hello","World",Triple(1,2,3))
            println("Number is $num6")
        }

        private fun addSum(a: Int, b: Int): Int {
            return a + b
        }

        //        private fun addSum(a : Int, b : Int) : Any{
//            return a + b
//        }
        //This is function overloading(Compile Time PolymorPhisom)
        private fun addSum(a: Int, b: Int, c: Int): Any {
            return a + b + c
        }

    }
}
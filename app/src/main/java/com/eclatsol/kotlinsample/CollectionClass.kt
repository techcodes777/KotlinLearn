package com.eclatsol.kotlinsample

class CollectionClass {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            //immutableList //Static//Element add,remove,change no thay ,fix define rahe
            //Implicitly-Explicitly List Declare karvi pade no karo topan chale
            //Type define karo to oorder list ma define thashe
//            val list = listOf<Any>("Hello", "World", "Good Morning", "How are you?",2,15) //Object ni jem kam karshe //Any type ni list che //Tema koi pan value store karvai shako int,float etc.
//            println(list)

            val list = listOf(1,2,3, listOf("Hello")) //Nested list tame print karvai shako shavo //list ni andar list
            println(list)

            val listData = listOf(1,2,3)
            listData.filter {
                it % 2 == 0 //filter ma it no use thay che
            }.map {
                it * it
            }.forEach {
                println("Map and Filter $it")
            }

            val mList = mutableListOf("Hello","Good Morning")//String type ni mutable list che //Khabar kya thi pade kya type ni string type ni che()Brecket ma je element(value) che tenati
            mList.add("Good")
            mList.add(0,"Thank you vary much")
            //mList.add(2) //Runtime per khali string value add thay che atle intger no chale
            println(mList)

            val mList1 = mutableListOf<Any>("I am happy","Good")
            mList1.add("Good") //Any Type mention kari do atle koi pan value add kari shako Int,String
            mList1.add(15)
            println(mList1)

            val mList2 = mutableListOf("Hello","World",15)
            mList2.add(15) //Value add karva mate pela bracket ma jovanu kya kya type ni value che
            mList2.add("My village is very beautiful")

            println(mList2)

            val list3 = mutableListOf<String>("Welcome","Good morning")
            mList.addAll(list3)
            println("List Three $mList")


            //Set
            println()
            //immutable list
            val aSet = setOf("12",1,"Mohit","Nayan")
             //immutable che runtime per write update operation nahi kari shaku
            //Read only operation operation kari shaksho
            println(aSet)

            //Runtime value add,change,update remove kari shako shavo mutable set ma
            val mSet = mutableSetOf<Any>("Raj","Rajeev",1,1,false) //Duplicate value contain nathi kartu//duplicate value add thati nathi
            mSet.addAll(aSet) //Set ma set ni set kari shako
            println("Mutable set : $mSet")

            //Map
            println()
            //Imuble map of
            //Runtime per add,remove,change nahi kari shako //value static rashe //Fix value define rahshe
            val iMap = mapOf<Any,String>(1 to "Hello",2 to "World", "Good" to "Morning",true to "Nice") //Key Value pair che
            println("IimutableMap of $iMap")

            val allMap = mapOf(1 to 15, 2 to 50)
            println("ImutableList of $allMap")

            //Imutable map ne hu change kari shaku shu mutbale map ni andar
            val mMap = mutableMapOf<Int,String>() //Bracket ma valur pass nathi karo atle typr mention l=karvi padshe

            val map = mapOf<Int,String>(1 to "Krishna",2 to "Mahesh",3 to "Hanumanji") //Type mention no karo ne to pan chale

            mMap.putAll(map)

            mMap[2] = "Naradji" //Immuatable map ne change kari dithu
            println("Mutable map : $mMap")

            println(mMap[2])

            for (maps in mMap.keys){
                println("Key = $maps")
            }

            for (maps in mMap.values){
                println("Value = $maps")
            }

            for ((key,value) in mMap){
                println("$key = $value")
            }


            //ArrayList
            println()
            println("ArrayList")
            var name : String = ""
            val arrList = ArrayList<String>()

            //ArrayList ma tame je add karela element ne remove or change kari shako shavo
            arrList.add("A")
            arrList.add("B") //Data Add Kara
            arrList.add("C") //Data Add Kara

            arrList[2] = "50"  //Set value //te jovanu arraylist ni length ketli che 2 length ,2 value add kareli che

            name = arrList[2]  //Get value


            arrList.remove("A") //Element thi list ne remove karvi shavi
            arrList.removeAt(1) //Index thi remove karvi shavi

            arrList.run {
                arrList.add("5")
                "Hello World"
            }

            println(arrList.toString())
            println("The name is : $name")

        }


    }
}
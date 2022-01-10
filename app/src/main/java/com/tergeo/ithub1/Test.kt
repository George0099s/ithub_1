package com.tergeo.ithub1

val cat = "sasdasd"
var dog: Long = 1L

fun summ(a: Int, b: Int): String = (a+b).toString()

fun summ2(a: Int, b: Int): String {

    return "2"
}

open class Animal

abstract class Cat

interface Click {
    fun click()
}

enum class Animals{
    CAT,
    DOG
}

fun main(args: Array<String>) {
   var test: Test? = null

//    test = Test("12")

    test!!.printAge()
    println("end")
}

class Test: Animal, Click {

    private var age: String? = null

    constructor(){

    }

    constructor(age: String){
        this.age = age
    }

    fun printAge(){
       println(age)
    }

    fun printAge(str: String){
       println(age)
    }

    fun summ(a: Int){
        val animal: Animals = Animals.CAT
        val list = listOf(1,3,34,5,5)
        val mutableList = mutableListOf<Any>(1,3,34,5,5,"q12", 1L)

        val voice = if (animal == Animals.CAT) "мяу" else "гав"

        val action = when(animal) {
            Animals.CAT -> println("мяу")
            Animals.DOG -> println("гав")
        }

        for(item in list)
            println(item)
    }

    override fun click() {
        TODO("Not yet implemented")
    }
}


package com.kotlin_example.kotlinpractice

fun main() {
// variables
    // string
    val name: Char = 'a'
    val name2: String = "Goku"
    // boolean
    val siono: Boolean = true
    // number
    val number: Int = 50
    val longNumber: Long = 99999999
    val dotNumber: Float = 23.2f
    val doubleNumber: Double = 23.3333333333

    //logs
    println("en una linea xd")
    // var puede cambiar
    var name3 = "ola"
    // val no cambia
    val name4 = "ola2"
    // nullable
    var name5: String? = null
    // no sera null
    // print(name5!!)
    // optional condition
    print(name5?.get(3) ?: "Es null :v")
    //Array
    val weekDays = arrayOf("monday", "Tuesday", "Thursday")
    var weekDaysMutable: MutableList<String> = mutableListOf("0la", "adios", "buenas taldels")
    println(weekDays[0])
    println(weekDays.size)
    // map
    for (weekDay in weekDays){
        println("dia $weekDay")
    }
    weekDays.forEach { item -> print(item) }
    // mutable
    weekDaysMutable.add(1, "ola de nuevo")
}

var month = 1
fun getMonth (mes: Int){
    // switch
    when (mes){
        1 -> println("enero")
        2 -> println("febrero")
        3 -> println("marzo")
        else -> print("no me han programado :V")
    }
}
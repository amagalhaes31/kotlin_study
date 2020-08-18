/*
    Author: Alexandre Magalhaes
    Date: August 18th, 2020
    Link: https://play.kotlinlang.org/koans/overview
 */

fun main (args: Array<String>) {

    // Simple function
    val name: String = "Alexandre"
    val age: Int = 33
    printfName(name, age)

    // Single-Expression functions
    val valueA = 20
    val valueB = 30
    var result = sum(valueA, valueB)
    println("The sum is $result. \n")

    // Default Arguments
    var i = getInt("5")
    println(i)
    i = getInt(null)
    println(i)
    i = getInt(null, 2)
    println(i)
    println()


    // Named Arguments
    namedArguments("Alexandre", "Magalhaes")
    namedArguments("Alexandre")
    namedArguments(lastName = "Magalhaes")
    println()


    // Generic Types
    val strings = toList<String> ("Alexandre", "Jessica", "Vida")
    println(strings)
    val ints = toList<Int> (33, 24, 100)
    println(ints)

}


// Simple function
fun printfName(name: String, age: Int) : Unit {             // Unity: It's meaning void return
    println("My name is ${name}. I'm $age years old.\n")
}


// Single-Expression functions
fun sum (numberA: Int, numberB: Int) = numberA + numberB


// Default Arguments
fun getInt(s: String?, defaultValue: Int = 0): Int {

    if( s != null) {
        return s.toInt()
    }

    return defaultValue
}


// Named Arguments
fun namedArguments(name: String? = null, lastName: String? = null) {
    println("Name = $name, Last Name = $lastName")
}


// Generic Types
fun <T> toList(vararg args:  T) : List<T> {
    val list = ArrayList<T>()

    for (s in args)
        list.add(s)

    return list
}
/*
    Author: Alexandre Magalhães
    Date: August 18th, 2020
    Link: https://kotlinlang.org/docs/reference/classes.html
 */


/*
    By default, Kotlin classes are final: they can’t be inherited.
    To make a class inheritable, mark it with the open keyword.

    open class CarInheritance (name: String, year: Int){}
    class Car(name: String, year: Int): CarInheritance(name, year) {}
 */

open class CarInheritance (name: String, year: Int) {
    val name: String
    val year: Int

    init {
        this.name = name                                            // "this" refers to the attribute internal
        this.year = year                                            // "this" refers to the attribute internal
    }

    open fun accelerate (speed: Int) {
        print("Speeding up this car to $speed.")
    }

    override fun toString(): String {
        return "Car-> $name, year -> $year"
    }
}


class Car(name: String, year: Int): CarInheritance(name, year) {
    override fun accelerate(speed: Int) {
        print("Speeding up this car to $speed.")
    }
}


fun main (args: Array<String>) {
    val c1 = Car("Ferrari", 2020)
    println(c1)
    println("Car: ${c1.name} , Year: ${c1.year}")
    c1.accelerate(200)
}


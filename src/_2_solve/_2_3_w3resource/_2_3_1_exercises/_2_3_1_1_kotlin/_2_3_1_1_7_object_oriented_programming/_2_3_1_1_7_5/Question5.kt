package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_5

import _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_5.factories.Animal
import _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_5.factories.Lion
import _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_5.factories.Tiger

/**
 * Write a Kotlin object-oriented program that implements the factory method pattern by creating an abstract class Animal with subclasses Tiger and Lion. Use a factory class to create instances of animals based on user input.
 * */

fun main() {
    println("Enter Animal (Lion or Tiger)")
    val userInput = readln()
    val targetAnimal = getAnimal(userInput)
    targetAnimal?.printSound()
}

fun getAnimal(type: String): Animal? = when (type.lowercase()) {
    "tiger" -> Tiger()
    "lion" -> Lion()
    else -> null
}
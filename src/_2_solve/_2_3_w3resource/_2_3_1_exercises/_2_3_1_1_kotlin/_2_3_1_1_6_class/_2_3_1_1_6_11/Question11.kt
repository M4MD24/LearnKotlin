package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_11

/**
 * Write a Kotlin program that creates a class 'Animal' with properties for name and sound. Include a function to make the animal's sound.
 * */

fun main() {
    print("Enter Name: ")
    val name = readln()
    print("Enter Sound: ")
    val sound = readln()
    val animal = Animal(name, sound)
    print("$name makes the sound: ${animal.makeSound()}")
}
package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_3

/**
 * Write a Kotlin program that creates a class 'Car' with properties for make, model, and year. Include a function to display car information.
 * */

fun main() {
    print("Enter Make: ")
    val make = readln()
    print("Enter Model: ")
    val model = readln()
    print("Enter Year: ")
    val year = readln().toShort()
    println("# Details of Car")
    Car(
        make,
        model,
        year
    ).printDetails()
}
package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_1

/**
 * Write a Kotlin program that creates a class 'Person' with properties for name, age, and country. Include a function to print the person's details.
 * */

fun main() {
    print("Enter Name: ")
    val name = readln()
    print("Enter Age: ")
    val age = readln().toShort()
    print("Enter Country: ")
    val country = readln()
    println("# Details of Person")
    Person(
        name,
        age,
        country
    ).printDetails()
}
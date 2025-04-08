package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_8

/**
 * Write a Kotlin program that creates a class 'Employee' with properties for name, age, and designation. Include a function to display employee details.
 * */

fun main() {
    print("Enter Name: ")
    val name = readln()
    print("Enter Age: ")
    val age = readln().toShort()
    print("Enter Designation: ")
    val designation = readln()
    println("# Details of Employee")
    Employee(
        name,
        age,
        designation
    ).printDetails()
}
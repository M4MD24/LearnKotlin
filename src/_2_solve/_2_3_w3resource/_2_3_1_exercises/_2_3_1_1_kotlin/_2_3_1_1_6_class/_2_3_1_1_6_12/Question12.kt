package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_12

/**
 * Write a Kotlin program that creates a class 'Customer' with properties for name, email, and address. Include a function to send a welcome email to the customer.
 * */

fun main() {
    print("Enter Name: ")
    val name = readln()
    print("Enter Email: ")
    val email = readln()
    print("Enter Address: ")
    val address = readln()
    val customer = Customer(
        name,
        email,
        address
    )
    customer.sendWelcomeEmail()
}
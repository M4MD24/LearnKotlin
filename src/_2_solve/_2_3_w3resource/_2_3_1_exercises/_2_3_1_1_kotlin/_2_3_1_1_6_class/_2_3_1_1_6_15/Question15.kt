package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_15

/**
 * Write a Kotlin program that creates a class 'Person' with a nested class 'ContactInfo' to store the person's contact information.
 * */

fun main() {
    print("Enter Name: ")
    val name = readln()
    val person = Person(name)
    print("Enter Mobile Number: ")
    val mobileNumber = readln()
    print("Enter Email: ")
    val email = readln()
    println("# Person Information")
    val personInformation = person.ContactInfo(mobileNumber, email)
    personInformation.printInformation()
}
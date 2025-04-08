package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_4

/**
 * Write a Kotlin program that creates a class 'Student' with properties for name, age, and grade. Include a function to check if the student is eligible for promotion.
 * */

fun main() {
    print("Enter Name: ")
    val name = readln()
    print("Enter Age: ")
    val age = readln().toShort()
    print("Enter Grade: ")
    val grade = readln().toFloat()
    val student = Student(name, age, grade)
    print("Is ${student.name} eligible for promotion?\n${student.isEligibleForPromotion()}")
}
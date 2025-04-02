package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_1

/**
 * Write a Kotlin function that takes a 'name' as an argument and prints a personalized greeting message to the user.
 * */

fun main() {
    print("Enter name: ")
    val name = readln()
    printGreetingTextForName(name)
}

private fun printGreetingTextForName(name: String) = print("Hello $name")
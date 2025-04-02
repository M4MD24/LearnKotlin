package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_17

import kotlin.math.sqrt

/**
 * Write a Kotlin function that takes an integer as an argument and returns a Boolean indicating whether the number is prime or not. Use explicit return type.
 * */

fun main() {
    print("Enter Number: ")
    val number = readln().toInt()
    print("$number is Prime?\n${isPrime(number)}")
}

private fun isPrime(number: Int): Boolean {
    if (number < 2)
        return false
    if (number == 2 || number == 3)
        return true
    if (number % 2 == 0 || number % 3 == 0)
        return false
    for (index in 5..sqrt(number.toDouble()).toInt() step 2)
        if (number % index == 0)
            return false
    return true
}
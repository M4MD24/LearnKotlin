package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_4_recursion._2_3_1_1_4_8

/**
 * Write a Kotlin recursive function to check if a number is a prime number.
 * */

fun main() {
    print("Enter Number: ")
    val number = readln().toInt()
    print("$number is Prime?\n${isPrime(number)}")
}

private fun isPrime(
    number: Int,
    divisor: Int = 2
): Boolean = when {
    number < 2 -> false
    divisor * divisor > number -> true
    number % divisor == 0 -> false
    else -> isPrime(
        number,
        if (divisor == 2)
            3
        else
            divisor + 2
    )
}
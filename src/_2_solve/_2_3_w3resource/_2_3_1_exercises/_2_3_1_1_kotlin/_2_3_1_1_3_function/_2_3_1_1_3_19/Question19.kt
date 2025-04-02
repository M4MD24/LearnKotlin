package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_19

/**
 * Write an Kotlin infix function that checks if a number is divisible by another number.
 * */

fun main() {
    print("Enter First Number: ")
    val firstNumber = readln().toDouble()

    print("Enter Second Number: ")
    val secondNumber = readln().toDouble()

    print("$firstNumber is divisible by $secondNumber?\n${firstNumber isDivisibleBy secondNumber}")
}

private infix fun Double.isDivisibleBy(divisor: Double): Boolean = this % divisor == 0.0
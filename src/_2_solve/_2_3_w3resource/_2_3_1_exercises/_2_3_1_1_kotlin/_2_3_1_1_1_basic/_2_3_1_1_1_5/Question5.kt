package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_1_basic._2_3_1_1_1_5

/**
 * Write a Kotlin program to perform addition, subtraction, multiplication and division of two numbers.
 * */

fun main() {
    print("Enter First Number: ")
    val firstNumber = readln().toDouble()

    print("Enter Second Number: ")
    val secondNumber = readln().toDouble()

    print(
        """
        Addition:       $firstNumber + $secondNumber = ${firstNumber + secondNumber}
        Subtraction:    $firstNumber - $secondNumber = ${firstNumber - secondNumber}
        Multiplication: $firstNumber * $secondNumber = ${firstNumber * secondNumber}
        Division:       $firstNumber / $secondNumber = ${
            if (secondNumber != 0.0)
                firstNumber / secondNumber
            else
            "Can't divide by zero"
        }""".trimIndent()
    )
}
package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_13

/**
 * Write a Kotlin program that creates a class 'MathUtils' with static functions to calculate the factorial, square root, and cube root of a number.
 * */

fun main() {
    print("Enter Number: ")
    val number = readln().toDouble()
    val mathUtilities = MathUtils(number)
    print(
        """
        Factorial of $number = ${mathUtilities.factorial()}
        Square Root of $number = ${mathUtilities.squareRoot()}
        Cube Root of $number = ${mathUtilities.cubeRoot()}""".trimIndent()
    )
}
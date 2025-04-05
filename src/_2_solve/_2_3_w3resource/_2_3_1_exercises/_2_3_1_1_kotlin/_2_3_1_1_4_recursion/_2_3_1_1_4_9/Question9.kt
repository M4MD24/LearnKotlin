package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_4_recursion._2_3_1_1_4_9

/**
 * Write a Kotlin recursive function to calculate the sum of all digits in a string.
 * */

fun main() {
    print("Enter Text Number: ")
    var textNumber = readln()
    if ('-' in textNumber)
        textNumber = textNumber.drop(1)
    print("Sum of Digits Of Numbers: ${getSumOfDigits(textNumber)}")
}

private fun getSumOfDigits(textNumber: String): Int = if (textNumber.length < 2)
    textNumber[0].digitToInt()
else
    textNumber[0].digitToInt() + getSumOfDigits(textNumber.drop(1))

// >
/*
fun main() {
    print("Enter Text Number: ")
    val textNumber = readln()
    print("Sum of Digits Of Numbers: ${getSumOfDigits(textNumber)}")
}

private fun getSumOfDigits(textNumber: String): Int = if (textNumber.length < 2)
    textNumber[0].digitToInt()
else
    (textNumber[0].digitToIntOrNull() ?: 0) + getSumOfDigits(textNumber.drop(1))
*/
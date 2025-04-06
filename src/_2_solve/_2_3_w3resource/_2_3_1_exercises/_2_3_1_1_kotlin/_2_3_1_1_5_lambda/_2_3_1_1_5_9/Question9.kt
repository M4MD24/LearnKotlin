package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_5_lambda._2_3_1_1_5_9

/**
 * Write an anonymous Kotlin function to calculate the factorial of a number.
 * */

fun main() {
    print("Enter Number: ")
    val number = readln().toInt()
    val fibonacci = { value: Int -> (1..value).fold(1L) { accumulator, index -> accumulator * index } }
    print("Fibonacci of $number = ${fibonacci(number)}")
}
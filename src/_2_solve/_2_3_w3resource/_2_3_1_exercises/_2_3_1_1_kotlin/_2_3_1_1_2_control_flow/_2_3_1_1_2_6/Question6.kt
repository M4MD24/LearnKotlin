package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_2_control_flow._2_3_1_1_2_6

/**
 * Write a Kotlin program to print the Fibonacci series up to a given number.
 * */

fun main() {
    print("Enter number: ")
    val number = readln().toByte()
    print(getFibonacciSeriesUp(number))
}

private fun getFibonacciSeriesUp(limitNumber: Byte): MutableList<Long> {
    val fibonacciSeriesUp: MutableList<Long> = mutableListOf()
    var previousNumber = 0L
    fibonacciSeriesUp.add(previousNumber)
    var currentNumber = 1L
    while (currentNumber <= limitNumber) {
        fibonacciSeriesUp.add(currentNumber)
        currentNumber += previousNumber.also {
            previousNumber = currentNumber
        }
    }
    return fibonacciSeriesUp
}
package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_2_control_flow._2_3_1_1_2_7

/**
 * Write a Kotlin program to calculate the sum of all numbers between two given numbers.
 * */

fun main() {
    print("Enter first number: ")
    var firstNumber = readln().toInt()

    print("Enter second number: ")
    var secondNumber = readln().toInt()

    if (firstNumber > secondNumber)
        firstNumber = secondNumber.also { secondNumber = firstNumber }

    print("Sum of All Numbers Between $firstNumber and $secondNumber: ${getSumOfAllNumbersBetweenTwoNumbers(firstNumber, secondNumber)}")
}

private fun getSumOfAllNumbersBetweenTwoNumbers(
    startNumber: Int,
    endNumber: Int
) = (endNumber - startNumber + 1) * (startNumber + endNumber) / 2L

// >
/*
private fun getSumOfAllNumbersBetweenTwoNumbers(
    startNumber: Int,
    endNumber: Int
) = (startNumber..endNumber).sum()
*/

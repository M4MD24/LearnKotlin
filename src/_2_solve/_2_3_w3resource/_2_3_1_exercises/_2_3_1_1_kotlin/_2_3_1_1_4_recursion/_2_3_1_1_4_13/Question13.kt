package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_4_recursion._2_3_1_1_4_13

/**
 * Write a Kotlin recursive function to calculate the sum of all even numbers in a range.
 * */

fun main() {
    println("Enter Start Number (Inclusive)")
    var startNumber = readln().toInt()
    println("Enter End Number (Inclusive)")
    var endNumber = readln().toInt()
    if (startNumber > endNumber)
        startNumber = endNumber.also { endNumber = startNumber }
    print("Sum of even numbers in range $startNumber to $endNumber: ${getSumOfEvenNumbers(startNumber, endNumber)}")
}

private fun getSumOfEvenNumbers(
    startNumber: Int,
    endNumber: Int
): Long = if (startNumber <= endNumber)
    if (startNumber % 2 == 0)
        startNumber + getSumOfEvenNumbers(
            startNumber + 1,
            endNumber
        )
    else
        getSumOfEvenNumbers(
            startNumber + 1,
            endNumber
        )
else
    0
package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_4_recursion._2_3_1_1_4_15

/**
 * Write a Kotlin tail-recursive function to calculate the sum of all numbers from 1 to n.
 * */

fun main() {
    print("Enter Target Number: ")
    val targetNumber = readln().toInt()
    print("Sum of Numbers from 1 to $targetNumber = ${getSumOfNumbersBetween1ToTargetNumber(targetNumber)}")
}

private tailrec fun getSumOfNumbersBetween1ToTargetNumber(
    targetNumber: Int,
    accumulator: Long = 0
): Long = if (targetNumber > 1)
    getSumOfNumbersBetween1ToTargetNumber(
        targetNumber - 1,
        accumulator + targetNumber
    )
else
    1L + accumulator
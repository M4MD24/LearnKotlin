package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_15

/**
 * Write a Kotlin function that prints a pattern of asterisks based on a given size. The size represents the number of rows and columns in the pattern. Use a single-expression function.
 * */

fun main() {
    print("Enter Number: ")
    val rowsAndColumns = readln().toInt()
    println("Asterisks:")
    printAsterisks(rowsAndColumns)
}

private fun printAsterisks(rowsAndColumns: Int) = repeat(rowsAndColumns) { println("*".repeat(rowsAndColumns)) }
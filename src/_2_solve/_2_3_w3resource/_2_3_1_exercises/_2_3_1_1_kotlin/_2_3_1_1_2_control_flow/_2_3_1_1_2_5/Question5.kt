package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_2_control_flow._2_3_1_1_2_5

/**
 * Write a Kotlin program to print the Pascal's triangle of a given number of rows.
 * */

fun main() {
    print("Enter count of lines: ")
    val countOfLines = readln().toInt()

    printPascalTriangle(countOfLines)
}

private fun printPascalTriangle(countOfLines: Int) {
    val pascalTriangleLine = Array(countOfLines) { IntArray(it + 1) }
    for (row in 0..<countOfLines) {
        pascalTriangleLine[row][0] = 1
        pascalTriangleLine[row][row] = 1
        for (column in 1..<row)
            pascalTriangleLine[row][column] = pascalTriangleLine[row - 1][column - 1] + pascalTriangleLine[row - 1][column]
        println(pascalTriangleLine[row].joinToString(" "))
    }
}
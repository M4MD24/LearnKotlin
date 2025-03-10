package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_l_pascal_triangle

fun main() {
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
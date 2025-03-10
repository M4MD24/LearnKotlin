package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_n_sum_of_a_matrix

fun main() {
    val (
        rows,
        columns
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    val firstMatrixNumbers = inputNumbers(rows)
    val secondMatrixNumbers = inputNumbers(rows)
    printSumOfTwoMatrices(
        firstMatrixNumbers,
        secondMatrixNumbers
    )
}

private fun printSumOfTwoMatrices(
    firstMatrixNumbers: List<List<Byte>>,
    secondMatrixNumbers: List<List<Byte>>,
    rows: Byte = (firstMatrixNumbers.size - 1).toByte(),
    columns: Byte = (firstMatrixNumbers[0].size - 1).toByte()
): Unit =
    if (rows == (-1).toByte()) {
    } else {
        if (columns == 0.toByte()) {
            printSumOfTwoMatrices(
                firstMatrixNumbers,
                secondMatrixNumbers,
                (rows - 1).toByte()
            )
            if (rows > 0)
                println()
        } else {
            printSumOfTwoMatrices(
                firstMatrixNumbers,
                secondMatrixNumbers,
                rows,
                (columns - 1).toByte()
            )
        }
        print("${firstMatrixNumbers[rows.toInt()][columns.toInt()] + secondMatrixNumbers[rows.toInt()][columns.toInt()]} ")
    }

private fun inputNumbers(
    rows: Byte,
    numbers: MutableList<MutableList<Byte>> = mutableListOf()
): List<List<Byte>> = if (rows == 0.toByte())
    numbers
else {
    val currentRowNumbers = readln()
        .split(' ')
        .map { it.toByte() }
        .toMutableList()
    numbers.addAll(listOf(currentRowNumbers))
    inputNumbers(
        (rows - 1).toByte(),
        numbers
    )
}
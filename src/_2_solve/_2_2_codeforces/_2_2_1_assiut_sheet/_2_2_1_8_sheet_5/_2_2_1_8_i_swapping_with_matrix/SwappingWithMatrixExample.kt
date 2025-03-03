package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_8_sheet_5._2_2_1_8_i_swapping_with_matrix

fun main() {
    val (
        size,
        firstRow,
        secondRow
    ) = readln()
        .split(' ')
        .map { it.toShort() }
    val matrix = Array(size.toInt()) {
        readln()
            .split(' ')
            .map { it.toShort() }
            .toMutableList()
    }
    swapRows(
        matrix,
        firstRow - 1,
        secondRow - 1
    )
    swapColumns(
        matrix,
        firstRow - 1,
        secondRow - 1
    )
    printMatrix(matrix)
}

private fun swapRows(
    matrix: Array<MutableList<Short>>,
    firstRow: Int,
    secondRow: Int
) {
    val temporaryValue = matrix[firstRow]
    matrix[firstRow] = matrix[secondRow]
    matrix[secondRow] = temporaryValue
}

// >
/*
private fun swapRows(
    matrix: Array<MutableList<Short>>,
    firstRow: Int,
    secondRow: Int
) {
    matrix[firstRow] = matrix[secondRow].also { matrix[secondRow] = matrix[firstRow] }
}
*/

private fun swapColumns(
    matrix: Array<MutableList<Short>>,
    firstColumn: Int,
    secondColumn: Int
) {
    for (index in matrix.indices) {
        val temporaryValue = matrix[index][firstColumn]
        matrix[index][firstColumn] = matrix[index][secondColumn]
        matrix[index][secondColumn] = temporaryValue
    }
}

// >
/*
private fun swapColumns(
    matrix: Array<MutableList<Short>>,
    firstColumn: Int,
    secondColumn: Int
) {
    for (index in matrix.indices)
        matrix[index][firstColumn] = matrix[index][secondColumn].also { matrix[index][secondColumn] = matrix[index][firstColumn] }
}
*/

private fun printMatrix(matrix: Array<MutableList<Short>>) = matrix.forEach { println(it.joinToString(" ")) }
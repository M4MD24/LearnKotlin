package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_f_multiplication_of_matrices

fun main() {
    val (
        firstMatrixRows,
        firstMatrixColumns
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    val firstMatrix = Array(firstMatrixRows.toInt()) {
        readln()
            .split(' ')
            .map { it.toByte() }
            .toByteArray()
    }
    val (
        secondMatrixRows,
        secondMatrixColumns
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    val secondMatrix = Array(secondMatrixRows.toInt()) {
        readln()
            .split(' ')
            .map { it.toByte() }
            .toByteArray()
    }
    val resultOfMultiplicationOfMatrices = getResultOfMultiplicationOfMatrices(
        firstMatrixRows,
        secondMatrixColumns,
        firstMatrixColumns,
        firstMatrix,
        secondMatrix
    )
    resultOfMultiplicationOfMatrices.forEach { println(it.joinToString(" ")) }
}

private fun getResultOfMultiplicationOfMatrices(
    firstMatrixRows: Byte,
    secondMatrixColumns: Byte,
    firstMatrixColumns: Byte,
    firstMatrix: Array<ByteArray>,
    secondMatrix: Array<ByteArray>
): Array<IntArray> {
    val resultOfMultiplicationOfMatrices = Array(firstMatrixRows.toInt()) { IntArray(secondMatrixColumns.toInt()) }
    for (currentFirstMatrixRow in 0..<firstMatrixRows)
        for (currentSecondMatrixColumn in 0..<secondMatrixColumns)
            for (currentFirstMatrixColumn in 0..<firstMatrixColumns)
                resultOfMultiplicationOfMatrices[currentFirstMatrixRow][currentSecondMatrixColumn] += firstMatrix[currentFirstMatrixRow][currentFirstMatrixColumn] * secondMatrix[currentFirstMatrixColumn][currentSecondMatrixColumn]
    return resultOfMultiplicationOfMatrices
}
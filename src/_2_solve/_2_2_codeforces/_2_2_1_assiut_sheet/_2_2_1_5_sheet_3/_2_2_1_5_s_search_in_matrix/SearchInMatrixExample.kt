package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_s_search_in_matrix

fun main() {
    val (
        rows,
        columns
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    val matrixValues = List(rows.toInt()) {
        readln()
            .split(' ')
            .map { it.toInt() }
    }
    val targetNumber = readln().toInt()
    print(
        if (matrixValues.any { rowValues -> targetNumber in rowValues })
            "will not take number"
        else
            "will take number"
    )
}

// >
/*
fun main() {
    val (
        row,
        column
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    val matrixValues = mutableListOf<MutableList<Int>>()
    for (rowIndex in 0..<row)
        matrixValues.add(
            readln()
                .split(' ')
                .map { it.toInt() }
                .toMutableList()
        )
    val targetValue = readln().toInt()
    for (rowIndex in 0..<row)
        if (matrixValues[rowIndex].contains(targetValue)) {
            print("will not take number")
            return
        }
    print("will take number")
}*/

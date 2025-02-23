package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_w_mirror_array

fun main() {
    val (
        rows,
        columns
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val mirroredMatrixValues = Array(rows) {
        readln()
            .split(' ')
            .map { it.toInt() }
            .reversed()
    }
    for (row in mirroredMatrixValues)
        println(row.joinToString(" "))
}
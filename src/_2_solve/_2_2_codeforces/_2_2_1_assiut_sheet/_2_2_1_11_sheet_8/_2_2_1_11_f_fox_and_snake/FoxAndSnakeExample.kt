package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_11_sheet_8._2_2_1_11_f_fox_and_snake

fun main() {
    val (
        rows,
        columns
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    for (currentRow in 0..<rows)
        println(
            when {
                currentRow % 4 == 1 -> ".".repeat(columns - 1) + "#"
                currentRow % 4 == 3 -> "#" + ".".repeat(columns - 1)
                else -> "#".repeat(columns.toInt())
            }
        )
}
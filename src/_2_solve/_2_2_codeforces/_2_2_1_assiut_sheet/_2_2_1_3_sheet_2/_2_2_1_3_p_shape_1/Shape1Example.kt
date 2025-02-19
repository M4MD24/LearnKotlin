package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_p_shape_1

fun main() {
    val countOfLines = readln().toByte()
    print(
        (countOfLines downTo 1)
            .joinToString("\n")
            { "*".repeat(it) }
    )
}
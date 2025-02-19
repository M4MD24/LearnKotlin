package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_o_pyramids

fun main() {
    val countOfLines = readln().toByte()
    print(
        (1..countOfLines)
            .joinToString("\n")
            { "*".repeat(it) }
    )
}
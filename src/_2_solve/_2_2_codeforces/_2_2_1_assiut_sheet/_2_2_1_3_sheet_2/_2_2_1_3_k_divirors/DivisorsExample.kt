package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_k_divirors

fun main() {
    val targetNumber = readln().toShort()
    print(
        (1..targetNumber)
            .filter { targetNumber % it == 0 }
            .joinToString("\n")
    )
}
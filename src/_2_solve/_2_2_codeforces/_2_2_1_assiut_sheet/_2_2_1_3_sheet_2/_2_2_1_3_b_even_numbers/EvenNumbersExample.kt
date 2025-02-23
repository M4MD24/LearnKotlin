package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_b_even_numbers

fun main() {
    val targetNumber = readln().toShort()
    printEvenNumbers(targetNumber)
}

private fun printEvenNumbers(targetNumber: Short) = print(
    if (targetNumber > 1)
        (2..targetNumber)
            .filter { it % 2 == 0 }
            .joinToString("\n")
    else
        -1
)
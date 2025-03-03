package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_8_sheet_5._2_2_1_8_a_add

fun main() {
    val (
        firstNumber,
        secondNumber
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    print(
        addition(
            firstNumber,
            secondNumber
        )
    )
}

private fun addition(
    firstNumber: Int,
    secondNumber: Int
) = firstNumber + secondNumber
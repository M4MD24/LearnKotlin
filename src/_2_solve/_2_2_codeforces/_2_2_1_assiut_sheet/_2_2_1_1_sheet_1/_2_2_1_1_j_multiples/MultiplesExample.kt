package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_j_multiples

fun main() {
    val line = readln().split(' ')
    val firstNumber = line[0].toLong()
    val secondNumber = line[1].toLong()
    val condition = if (
        firstNumber % secondNumber == 0L ||
        secondNumber % firstNumber == 0L
    )
        "Multiples"
    else
        "No Multiples"
    print(condition)
}
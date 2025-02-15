package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_i_welcome_for_you_with_conditions

fun main() {
    val line = readln().split(' ')
    val firstNumber: Int = line[0].toInt()
    val secondNumber: Int = line[1].toInt()
    val condition = if (firstNumber >= secondNumber)
        "Yes"
    else
        "No"
    print(condition)
}
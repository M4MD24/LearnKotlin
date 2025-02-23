package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_d_difference

fun main() {
    val line = readln().split(' ')
    val firstNumber = line[0].toLong()
    val secondNumber = line[1].toLong()
    val thirdNumber = line[2].toLong()
    val fourthNumber = line[3].toLong()

    val firstResult = (firstNumber * secondNumber)
    val secondResult = (thirdNumber * fourthNumber)

    print("Difference = ${firstResult - secondResult}")
}
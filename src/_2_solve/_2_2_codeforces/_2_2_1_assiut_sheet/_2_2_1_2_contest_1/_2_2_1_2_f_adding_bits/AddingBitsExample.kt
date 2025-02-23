package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_2_contest_1._2_2_1_2_f_adding_bits

fun main() {
    val line = readln().split(' ')
    val firstNumber= line[0].toInt()
    val secondNumber= line[1].toInt()
    val sumBinaryNumbers = firstNumber xor secondNumber
    print(sumBinaryNumbers)
}
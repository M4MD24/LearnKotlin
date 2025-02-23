package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_c_simple_calculator

fun main() {
    val line = readln().split(' ')
    val firstNumber = line[0].toLong()
    val secondNumber = line[1].toLong()
    print(
        """
        $firstNumber + $secondNumber = ${firstNumber + secondNumber}
        $firstNumber * $secondNumber = ${firstNumber * secondNumber}
        $firstNumber - $secondNumber = ${firstNumber - secondNumber}""".trimIndent()
    )
}
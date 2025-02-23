package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_f_digits_summation

fun main() {
    val line = readln().split(' ')
    val firstNumber = line[0].toLong()
    val secondNumber = line[1].toLong()
    val lastDigitOfFirstNumber = getLastDigitOfNumber(firstNumber)
    val lastDigitOfSecondNumber = getLastDigitOfNumber(secondNumber)
    print(lastDigitOfFirstNumber + lastDigitOfSecondNumber)
}

private fun getLastDigitOfNumber(number: Long) = number % 10
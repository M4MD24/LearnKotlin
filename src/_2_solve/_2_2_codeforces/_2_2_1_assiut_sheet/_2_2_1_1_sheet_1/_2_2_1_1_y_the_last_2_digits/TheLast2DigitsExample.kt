package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_y_the_last_2_digits

fun main() {
    val line = readln().split(' ')
    val firstNumber = line[0].toInt()
    val secondNumber = line[1].toInt()
    val thirdNumber = line[2].toInt()
    val fourthNumber = line[3].toInt()
    val resultOfMultiplication4Numbers = getResultOfMultiplication4Last2DigitsOfNumbers(
        firstNumber,
        secondNumber,
        thirdNumber,
        fourthNumber
    )
    print(
        "%02d".format(getLast2Digits(resultOfMultiplication4Numbers))
    )
}

private fun getResultOfMultiplication4Last2DigitsOfNumbers(
    firstNumber: Int,
    secondNumber: Int,
    thirdNumber: Int,
    fourthNumber: Int
) = getLast2Digits(firstNumber) *
        getLast2Digits(secondNumber) *
        getLast2Digits(thirdNumber) *
        getLast2Digits(fourthNumber)

private fun getLast2Digits(number: Int) = number % 100
package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_2_contest_1._2_2_1_2_d_ali_baba_and_puzzles

fun main() {
    val line = readln().split(' ')
    val firstNumber = line[0].toLong()
    val secondNumber = line[1].toLong()
    val thirdNumber = line[2].toLong()
    val fourthNumber = line[3].toLong()
    print(
        checkTheResult(
            firstNumber,
            secondNumber,
            thirdNumber,
            fourthNumber
        )
    )
}

private fun checkTheResult(
    firstNumber: Long,
    secondNumber: Long,
    thirdNumber: Long,
    fourthNumber: Long
): String {
    val firstResult = firstNumber + secondNumber - thirdNumber
    val secondResult = firstNumber + secondNumber * thirdNumber
    val thirdResult = firstNumber - secondNumber + thirdNumber
    val fourthResult = firstNumber - secondNumber * thirdNumber
    val fifthResult = firstNumber * secondNumber + thirdNumber
    val sixthResult = firstNumber * secondNumber - thirdNumber
    val firstPossibility: Boolean = fourthNumber == firstResult
    val secondPossibility: Boolean = fourthNumber == secondResult
    val thirdPossibility: Boolean = fourthNumber == thirdResult
    val fourthPossibility: Boolean = fourthNumber == fourthResult
    val fifthPossibility: Boolean = fourthNumber == fifthResult
    val sixthPossibility: Boolean = fourthNumber == sixthResult
    return if (
        firstPossibility ||
        secondPossibility ||
        thirdPossibility ||
        fourthPossibility ||
        fifthPossibility ||
        sixthPossibility
    )
        "YES"
    else
        "NO"
}
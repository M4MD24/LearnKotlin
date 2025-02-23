package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_2_contest_1._2_2_1_2_b_memo_and_momo

fun main() {
    val line = readln().split(' ')
    val memoValue = line[0].toLong()
    val momoValue = line[1].toLong()
    val divisorNumber = line[2].toLong()
    print(
        checkWhoWin(
            memoValue,
            momoValue,
            divisorNumber
        )
    )
}

private fun checkWhoWin(
    firstNumber: Long,
    secondNumber: Long,
    divisorNumber: Long
): String {
    val isFirstNumberThatWon = firstNumber % divisorNumber == 0L
    val isSecondNumberThatWon = secondNumber % divisorNumber == 0L
    val areBothNumbersWinning = isFirstNumberThatWon && isSecondNumberThatWon
    return if (areBothNumbersWinning)
        "Both"
    else if (isFirstNumberThatWon)
        "Memo"
    else if (isSecondNumberThatWon)
        "Momo"
    else
        "No One"
}
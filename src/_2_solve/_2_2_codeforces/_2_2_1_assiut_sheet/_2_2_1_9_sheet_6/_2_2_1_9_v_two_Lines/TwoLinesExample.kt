package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_v_two_Lines

fun main() {
    val (
        firstNumberFirstLine,
        firstNumberSecondLine,
        secondNumberFirstLine,
        secondNumberSecondLine
    ) = readln()
        .split(' ')
        .map { it.toShort() }
    val (
        thirdNumberFirstLine,
        thirdNumberSecondLine,
        fourthNumberFirstLine,
        fourthNumberSecondLine
    ) = readln()
        .split(' ')
        .map { it.toShort() }
    print(
        if (isParallel(
                firstNumberFirstLine,
                firstNumberSecondLine,
                secondNumberFirstLine,
                secondNumberSecondLine,
                thirdNumberFirstLine,
                thirdNumberSecondLine,
                fourthNumberFirstLine,
                fourthNumberSecondLine
            )
        )
            "YES"
        else
            "NO"
    )
}

private fun isParallel(
    firstNumberFirstLine: Short,
    firstNumberSecondLine: Short,
    secondNumberFirstLine: Short,
    secondNumberSecondLine: Short,
    thirdNumberFirstLine: Short,
    thirdNumberSecondLine: Short,
    fourthNumberFirstLine: Short,
    fourthNumberSecondLine: Short
): Boolean {
    val firstDeltaFirstLine = (secondNumberFirstLine - firstNumberFirstLine).toShort()
    val firstDeltaSecondLine = (secondNumberSecondLine - firstNumberSecondLine).toShort()
    val secondDeltaFirstLine = (fourthNumberFirstLine - thirdNumberFirstLine).toShort()
    val secondDeltaSecondLine = (fourthNumberSecondLine - thirdNumberSecondLine).toShort()
    return firstDeltaFirstLine * secondDeltaSecondLine == secondDeltaFirstLine * firstDeltaSecondLine
}
package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_u_straight_line

fun main() {
    val (
        firstNumberFirstLine,
        firstNumberSecondLine
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val (
        secondNumberFirstLine,
        secondNumberSecondLine
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val (
        thirdNumberFirstLine,
        thirdNumberSecondLine
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    print(
        if (isCollinear(
                firstNumberFirstLine,
                firstNumberSecondLine,
                secondNumberFirstLine,
                secondNumberSecondLine,
                thirdNumberFirstLine,
                thirdNumberSecondLine
            )
        )
            "YES"
        else
            "NO"
    )
}

private fun isCollinear(
    firstNumberFirstLine: Int,
    firstNumberSecondLine: Int,
    secondNumberFirstLine: Int,
    secondNumberSecondLine: Int,
    thirdNumberFirstLine: Int,
    thirdNumberSecondLine: Int
) = calculateStraightnessOfLine(
    secondNumberFirstLine,
    firstNumberFirstLine,
    thirdNumberSecondLine,
    firstNumberSecondLine
) == calculateStraightnessOfLine(
    thirdNumberFirstLine,
    firstNumberFirstLine,
    secondNumberSecondLine,
    firstNumberSecondLine
)

private fun calculateStraightnessOfLine(
    currentPointX: Int, referencePointX: Int,
    currentPointY: Int, referencePointY: Int
) = (currentPointX - referencePointX) * (currentPointY - referencePointY)
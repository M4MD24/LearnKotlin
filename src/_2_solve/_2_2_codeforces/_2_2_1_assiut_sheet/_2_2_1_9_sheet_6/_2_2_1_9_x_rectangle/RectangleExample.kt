package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_x_rectangle

import kotlin.math.max
import kotlin.math.min

fun main() {
    val lineOfRectanglePoints = readln()
        .split(' ')
        .map { it.toInt() }
    val firstPointFirstRectangle = lineOfRectanglePoints[0]
    val firstPointSecondRectangle = lineOfRectanglePoints[1]
    val secondPointFirstRectangle = lineOfRectanglePoints[2]
    val secondPointSecondRectangle = lineOfRectanglePoints[3]
    val thirdPointFirstRectangle = lineOfRectanglePoints[4]
    val thirdPointSecondRectangle = lineOfRectanglePoints[5]
    val fourthPointFirstRectangle = lineOfRectanglePoints[6]
    val fourthPointSecondRectangle = lineOfRectanglePoints[7]
    val countOfCases = readln().toByte()
    repeat(countOfCases.toInt()) {
        val (
            firstPoint,
            secondPoint
        ) = readln()
            .split(' ')
            .map { it.toInt() }
        println(
            if (
                isBelongToRectangle(
                    firstPoint,
                    secondPoint,
                    firstPointFirstRectangle,
                    firstPointSecondRectangle,
                    secondPointFirstRectangle,
                    secondPointSecondRectangle,
                    thirdPointFirstRectangle,
                    thirdPointSecondRectangle,
                    fourthPointFirstRectangle,
                    fourthPointSecondRectangle
                )
            )
                "YES"
            else
                "NO"
        )
    }
}

private fun isBelongToRectangle(
    firstPoint: Int,
    secondPoint: Int,
    firstPointFirstRectangle: Int,
    firstPointSecondRectangle: Int,
    secondPointFirstRectangle: Int,
    secondPointSecondRectangle: Int,
    thirdPointFirstRectangle: Int,
    thirdPointSecondRectangle: Int,
    fourthPointFirstRectangle: Int,
    fourthPointSecondRectangle: Int
): Boolean {
    val minimumPointNumberFirstRectangle = min(
        min(
            firstPointFirstRectangle.toDouble(),
            secondPointFirstRectangle.toDouble()
        ),
        min(
            thirdPointFirstRectangle.toDouble(),
            fourthPointFirstRectangle.toDouble()
        )
    ).toInt()
    val maximumPointNumberFirstRectangle = max(
        max(
            firstPointFirstRectangle.toDouble(),
            secondPointFirstRectangle.toDouble()
        ),
        max(
            thirdPointFirstRectangle.toDouble(),
            fourthPointFirstRectangle.toDouble()
        )
    ).toInt()
    val minimumPointNumberSecondRectangle = min(
        min(
            firstPointSecondRectangle.toDouble(),
            secondPointSecondRectangle.toDouble()
        ),
        min(
            thirdPointSecondRectangle.toDouble(),
            fourthPointSecondRectangle.toDouble()
        )
    ).toInt()
    val maximumPointNumberSecondRectangle = max(
        max(
            firstPointSecondRectangle.toDouble(),
            secondPointSecondRectangle.toDouble()
        ),
        max(
            thirdPointSecondRectangle.toDouble(),
            fourthPointSecondRectangle.toDouble()
        )
    ).toInt()
    return (
            firstPoint in minimumPointNumberFirstRectangle..maximumPointNumberFirstRectangle &&
                    secondPoint >= minimumPointNumberSecondRectangle &&
                    secondPoint <= maximumPointNumberSecondRectangle
            )
}
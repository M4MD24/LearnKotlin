package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_z_geometry_test

import kotlin.math.sqrt

fun main() {
    val (
        circleRadius,
        squareSide
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    print(
        when {
            isCircle(circleRadius, squareSide) -> "Circle"
            isSquare(circleRadius, squareSide) -> "Square"
            else -> "Complex"
        }
    )
}

private fun isSquare(
    circleRadius: Int,
    squareSide: Int
) = 2 * circleRadius <= squareSide

private fun isCircle(
    circleRadius: Int,
    squareSide: Int
) = 2 * circleRadius >= squareSide * sqrt(2.0)
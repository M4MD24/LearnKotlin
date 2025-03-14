package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_w_circles

import kotlin.math.hypot

fun main() {
    val (
        firstPointFirstCircle,
        firstPointSecondCircle,
        secondPointFirstCircle,
        secondPointSecondCircle,
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val (
        thirdPointFirstCircle,
        thirdPointSecondCircle,
        fourthPointFirstCircle,
        fourthPointSecondCircle
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    print(
        if (isCirclesIntersect(
                firstPointFirstCircle,
                firstPointSecondCircle,
                secondPointFirstCircle,
                secondPointSecondCircle,
                thirdPointFirstCircle,
                thirdPointSecondCircle,
                fourthPointFirstCircle,
                fourthPointSecondCircle
            )
        )
            "YES"
        else
            "NO"
    )
}

private fun isCirclesIntersect(
    firstPointFirstCircle: Int,
    firstPointSecondCircle: Int,
    secondPointFirstCircle: Int,
    secondPointSecondCircle: Int,
    thirdPointFirstCircle: Int,
    thirdPointSecondCircle: Int,
    fourthPointFirstCircle: Int,
    fourthPointSecondCircle: Int
): Boolean {
    val firstMiddlePointFirstCircle = (firstPointFirstCircle + secondPointFirstCircle) / 2.0
    val firstMiddlePointSecondCircle = (firstPointSecondCircle + secondPointSecondCircle) / 2.0
    val secondMiddlePointFirstCircle = (thirdPointFirstCircle + fourthPointFirstCircle) / 2.0
    val secondMiddlePointSecondCircle = (thirdPointSecondCircle + fourthPointSecondCircle) / 2.0
    val radiusFirstCircle = hypot(
        firstPointFirstCircle - firstMiddlePointFirstCircle,
        firstPointSecondCircle - firstMiddlePointSecondCircle
    )
    val radiusSecondCircle = hypot(
        thirdPointFirstCircle - secondMiddlePointFirstCircle,
        thirdPointSecondCircle - secondMiddlePointSecondCircle
    )
    val distance = hypot(
        firstMiddlePointFirstCircle - secondMiddlePointFirstCircle,
        firstMiddlePointSecondCircle - secondMiddlePointSecondCircle
    )
    val sumOfRadius = radiusFirstCircle + radiusSecondCircle
    return (distance <= sumOfRadius)
}
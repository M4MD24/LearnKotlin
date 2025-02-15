package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_x_two_intervals

import kotlin.math.max
import kotlin.math.min

fun main() {
    val line = readln()
    val firstNumberInterval1 = line[0].code
    val secondNumberInterval1 = line[1].code
    val firstNumberInterval2 = line[2].code
    val secondNumberInterval2 = line[3].code
    val firstIntersection = max(
        firstNumberInterval1.toDouble(),
        firstNumberInterval2.toDouble()
    ).toInt()
    val secondIntersection = min(
        secondNumberInterval1.toDouble(),
        secondNumberInterval2.toDouble()
    ).toInt()
    print(
        if (firstIntersection <= secondIntersection)
            "$firstIntersection $secondIntersection"
        else
            -1
    )
}
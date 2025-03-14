package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_s_is_triangle

import kotlin.math.sqrt

fun main() {
    val (
        sideA,
        sideB,
        sideC
    ) = readln()
        .split(' ')
        .map { it.toDouble() }
    print(
        if (
            sideA + sideB > sideC &&
            sideA + sideC > sideB &&
            sideB + sideC > sideA
        ) {
            val semiPerimeter = (sideA + sideB + sideC) / 2
            val areaOfTriangle = sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))
            "Valid\n%.6f".format(areaOfTriangle)
        } else
            "Invalid"
    )
}
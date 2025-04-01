package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_13_sheet_10._2_2_1_13_l_two_squares

import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
    val (
        sideLength,
        firstVelocity,
        secondVelocity
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val queryCount = readln().toInt()
    repeat(queryCount) {
        val queryValue = readln().toDouble()
        println(
            "%.6f".format(
                abs(
                    sqrt(2.0) *
                            (sideLength - sqrt(queryValue)) /
                            (secondVelocity - firstVelocity)
                )
            )
        )
    }
}

/*
fun main() {
    val (
        sideLength,
        firstVelocity,
        secondVelocity
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val queryCount = readln().toInt()
    repeat(queryCount) {
        val queryValue = readln().toDouble()
        println(
            "%.6f".format(
                ((sideLength - sqrt(queryValue)) *
                        sqrt(2.0)) /
                        abs(firstVelocity - secondVelocity)
            )
        )
    }
}
*/
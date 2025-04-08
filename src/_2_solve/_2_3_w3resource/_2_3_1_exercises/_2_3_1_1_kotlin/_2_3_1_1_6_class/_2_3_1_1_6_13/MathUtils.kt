package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_13

import kotlin.math.cbrt
import kotlin.math.sqrt

class MathUtils(private val number: Double) {
    fun factorial(
        targetNumber: Double = number,
        accumulator: Double = 1.0
    ): Double = if (targetNumber <= 1)
        accumulator
    else factorial(
        targetNumber - 1,
        targetNumber * accumulator
    )

    fun squareRoot() = sqrt(number)

    fun cubeRoot() = cbrt(number)
}
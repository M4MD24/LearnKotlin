package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_1.shapes

import kotlin.math.sqrt

class Triangle(
    private val firstSide: Double,
    private val secondSide: Double,
    private val thirdSide: Double
) : Shape() {
    override fun area(): Double {
        val semiPerimeter = (firstSide + secondSide + thirdSide) / 2
        return sqrt(
            semiPerimeter *
                    (semiPerimeter - firstSide) *
                    (semiPerimeter - secondSide) *
                    (semiPerimeter - thirdSide)
        )
    }

    override fun perimeter() = firstSide + secondSide + thirdSide
}
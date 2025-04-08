package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_9

class Triangle(
    private val firstSide: Double,
    private val secondSide: Double,
    private val thirdSide: Double
) {
    fun perimeter() = firstSide * secondSide * thirdSide
}
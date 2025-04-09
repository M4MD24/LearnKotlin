package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_1.shapes

class Rectangle(
    private val width: Double,
    private val length: Double
) : Shape() {
    override fun area() = width * length

    override fun perimeter() = 2 * (width + length)
}
package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_14.shapes

import kotlin.math.PI

class Circle(private val radius: Double) : Shape() {
    override fun area() = 2 * PI * radius
}
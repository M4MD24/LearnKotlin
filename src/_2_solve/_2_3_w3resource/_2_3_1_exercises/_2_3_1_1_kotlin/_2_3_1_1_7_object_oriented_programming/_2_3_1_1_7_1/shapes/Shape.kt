package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_1.shapes

abstract class Shape {
    abstract fun area(): Double
    abstract fun perimeter(): Double
    fun printAreaAndPerimeter() = print(
        """
        area: ${area()}
        Perimeter: ${perimeter()}""".trimIndent()
    )
}
package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_18

/**
 * Write a Kotlin program that creates an enum class 'Color' with values for different colors. Use the enum class to represent an object's color.
 * */

fun main() {
    val plants = Object("Plants", Color.LIME_GREEN)
    val cloud = Object("Sky", Color.DEEP_SKY_BLUE)
    val flowers = Object("Flowers", Color.RED)
    print(
        """
        ${plants.name} color: ${plants.colorName}
        ${cloud.name} color: ${cloud.colorName}
        ${flowers.name} color: ${flowers.colorName}""".trimIndent()
    )
}
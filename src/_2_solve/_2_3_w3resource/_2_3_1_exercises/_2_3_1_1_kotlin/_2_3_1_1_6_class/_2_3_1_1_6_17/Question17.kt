package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_17

/**
 * Write a Kotlin program that creates a data class 'Point' with properties for x and y coordinates. Use a destructuring declaration to extract the coordinates.
 * */

fun main() {
    print("Enter Coordinate X: ")
    val coordinateX = readln().toDouble()
    print("Enter Coordinate Y: ")
    val coordinateY = readln().toDouble()
    val point = Point(coordinateX, coordinateY)
    println("# Point Coordinates")
    printPointCoordinates(point)
}

private fun printPointCoordinates(point: Point) {
    val (
        coordinateX,
        coordinateY
    ) = point
    print(
        """
        Coordinate X = $coordinateX
        Coordinate Y = $coordinateY""".trimIndent()
    )
}

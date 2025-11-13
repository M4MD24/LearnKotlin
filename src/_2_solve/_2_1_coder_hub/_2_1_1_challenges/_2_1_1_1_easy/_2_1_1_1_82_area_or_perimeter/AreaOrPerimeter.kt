package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_82_area_or_perimeter

fun main() {
    println(
        areaOrPerimeter(
            6, 10
        )
    )
    println(
        areaOrPerimeter(
            3, 3
        )
    )
    println(
        areaOrPerimeter(
            8, 8
        )
    )
    print(
        areaOrPerimeter(
            5, 10
        )
    )
}

private fun areaOrPerimeter(
    length : Int,
    width : Int
) = if (length == width)
    getAreaOfSquare(length, width)
else
    getPerimeterOfRectangle(length, width)

private fun getPerimeterOfRectangle(
    length : Int,
    width : Int
) = 2 * (length + width)

private fun getAreaOfSquare(
    length : Int,
    width : Int
) = length * width
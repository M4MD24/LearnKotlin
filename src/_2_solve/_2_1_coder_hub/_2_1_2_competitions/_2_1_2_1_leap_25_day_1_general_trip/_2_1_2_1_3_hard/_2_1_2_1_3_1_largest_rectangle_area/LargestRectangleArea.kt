package _2_solve._2_1_coder_hub._2_1_2_competitions._2_1_2_1_leap_25_day_1_general_trip._2_1_2_1_3_hard._2_1_2_1_3_1_largest_rectangle_area;

fun main() {
    println(largestRectangleArea(mutableListOf(2, 1, 5, 6, 2, 3)))
    println(largestRectangleArea(mutableListOf(2, 4)))
    println(largestRectangleArea(mutableListOf(6, 2, 5, 4, 5, 1, 6)))
    println(largestRectangleArea(mutableListOf(1, 1, 1, 1)))
}

fun largestRectangleArea(heights: MutableList<Int>): Int {
    val indexStack = mutableListOf<Int>()
    var maximumArea = 0
    val extendedHeights = heights + 0
    for (currentIndex in extendedHeights.indices) {
        while (indexStack.isNotEmpty() && extendedHeights[currentIndex] < extendedHeights[indexStack.last()]) {
            val height = extendedHeights[indexStack.removeAt(indexStack.lastIndex)]
            val width = if (indexStack.isEmpty())
                currentIndex
            else
                currentIndex - indexStack.last() - 1
            maximumArea = maxOf(maximumArea, height * width)
        }
        indexStack.add(currentIndex)
    }
    return maximumArea
}
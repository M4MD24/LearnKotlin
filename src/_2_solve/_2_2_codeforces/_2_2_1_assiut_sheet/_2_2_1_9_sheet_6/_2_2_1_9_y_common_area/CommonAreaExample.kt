package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_y_common_area

import kotlin.math.max

fun main() {
    val countOfCases = readln().toByte()
    repeat(countOfCases.toInt()) {
        val countOfRectangles = readln().toByte()
        var lineOfRectangle = readln()
            .split(' ')
            .map { it.toShort() }
        var topLeftFirstRectangle = lineOfRectangle[0]
        var topLeftSecondRectangle = lineOfRectangle[1]
        var bottomRightFirstRectangle = lineOfRectangle[2]
        var bottomRightSecondRectangle = lineOfRectangle[3]
        var maximumTopLeftFirstRectangle = topLeftFirstRectangle
        var maximumTopLeftSecondRectangle = topLeftSecondRectangle
        var minimumBottomRightFirstRectangle = bottomRightFirstRectangle
        var minimumBottomRightSecondRectangle = bottomRightSecondRectangle
        repeat(countOfRectangles - 1) {
            lineOfRectangle = readln()
                .split(' ')
                .map { it.toShort() }
            topLeftFirstRectangle = lineOfRectangle[0]
            topLeftSecondRectangle = lineOfRectangle[1]
            bottomRightFirstRectangle = lineOfRectangle[2]
            bottomRightSecondRectangle = lineOfRectangle[3]
            if (topLeftFirstRectangle > maximumTopLeftFirstRectangle)
                maximumTopLeftFirstRectangle = topLeftFirstRectangle
            if (topLeftSecondRectangle > maximumTopLeftSecondRectangle)
                maximumTopLeftSecondRectangle = topLeftSecondRectangle
            if (bottomRightFirstRectangle < minimumBottomRightFirstRectangle)
                minimumBottomRightFirstRectangle = bottomRightFirstRectangle
            if (bottomRightSecondRectangle < minimumBottomRightSecondRectangle)
                minimumBottomRightSecondRectangle = bottomRightSecondRectangle
        }
        val width = max(0.0, (minimumBottomRightFirstRectangle - maximumTopLeftFirstRectangle).toDouble())
        val height = max(0.0, (minimumBottomRightSecondRectangle - maximumTopLeftSecondRectangle).toDouble())
        val commonArea = width * height
        println("Case #$countOfCases: ${commonArea.toInt()}")
    }
}
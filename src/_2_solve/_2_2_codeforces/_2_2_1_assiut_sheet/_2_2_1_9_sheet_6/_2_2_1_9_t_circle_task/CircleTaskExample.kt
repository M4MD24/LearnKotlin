package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_t_circle_task

fun main() {
    val (
        centerX,
        centerY,
        radius,
        pointsNumber
    ) = readln()
        .split(' ')
        .map { it.toLong() }
    repeat(pointsNumber.toInt()) {
        val (
            pointX,
            pointY
        ) = readln()
            .split(' ')
            .map { it.toLong() }
        println(
            if (isInsideCircle(
                    pointX,
                    centerX,
                    pointY,
                    centerY,
                    radius
                )
            )
                "YES"
            else
                "NO"
        )
    }
}

private fun isInsideCircle(
    pointX: Long,
    centerX: Long,
    pointY: Long,
    centerY: Long,
    radius: Long
) = (pointX - centerX) * (pointX - centerX) + (pointY - centerY) * (pointY - centerY) <= radius * radius
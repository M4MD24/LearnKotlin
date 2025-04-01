package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_12_sheet_9._2_2_1_12_i_lineland_mail

fun main() {
    val cityCount = readln().toInt()
    val cityPositions = readln()
        .split(' ')
        .map { it.toInt() }

    for (index in 0..<cityCount) {
        val minimumDistance = when (index) {
            0 -> cityPositions[index + 1] - cityPositions[index]
            cityCount - 1 -> cityPositions[index] - cityPositions[index - 1]
            else -> minOf(
                cityPositions[index + 1] - cityPositions[index],
                cityPositions[index] - cityPositions[index - 1]
            )
        }

        val maximumDistance = maxOf(
            cityPositions[index] - cityPositions[0],
            cityPositions[cityCount - 1] - cityPositions[index]
        )

        println("$minimumDistance $maximumDistance")
    }
}
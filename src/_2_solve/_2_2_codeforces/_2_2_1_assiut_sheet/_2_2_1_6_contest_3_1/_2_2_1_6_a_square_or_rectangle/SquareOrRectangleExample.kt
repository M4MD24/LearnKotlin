package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_6_contest_3_1._2_2_1_6_a_square_or_rectangle

fun main() {
    val countOfCases = readln().toInt()
    repeat(countOfCases) {
        val (
            height,
            width
        ) = readln()
            .split(' ')
            .map { it.toInt() }
        println(
            squareOrRectangle(
                height,
                width
            )
        )
    }
}

private fun squareOrRectangle(
    height: Int,
    width: Int
) = if (height == width)
    "Square"
else
    "Rectangle"
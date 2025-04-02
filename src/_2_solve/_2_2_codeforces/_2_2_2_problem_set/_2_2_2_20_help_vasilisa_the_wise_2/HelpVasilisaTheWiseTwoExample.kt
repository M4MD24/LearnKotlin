package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_20_help_vasilisa_the_wise_2

fun main() {
    val (
        firstRowSum,
        secondRowSum
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    val (
        firstColumnSum,
        secondColumnSum
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    val (
        firstDiagonalSum,
        secondDiagonalSum
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    for (topLeft in 1..9)
        for (topRight in 1..9)
            for (bottomLeft in 1..9)
                for (bottomRight in 1..9)
                    if (
                        setOf(
                            topLeft,
                            topRight,
                            bottomLeft,
                            bottomRight
                        ).size == 4 &&
                        (topLeft + topRight).toByte() == firstRowSum &&
                        (bottomLeft + bottomRight).toByte() == secondRowSum &&
                        (topLeft + bottomLeft).toByte() == firstColumnSum &&
                        (topRight + bottomRight).toByte() == secondColumnSum &&
                        (topLeft + bottomRight).toByte() == firstDiagonalSum &&
                        (topRight + bottomLeft).toByte() == secondDiagonalSum
                    )
                        return print(
                            """
                            $topLeft $topRight
                            $bottomLeft $bottomRight""".trimIndent()
                        )
    print(-1)
}
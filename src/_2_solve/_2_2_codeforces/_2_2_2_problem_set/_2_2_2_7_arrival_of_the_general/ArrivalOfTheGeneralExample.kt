package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_7_arrival_of_the_general

fun main() {
    val countOfHeights = readln().toByte()
    val heights = readln()
        .split(' ')
        .map { it.toByte() }
    val maximumIndex = heights.indexOf(heights.maxOrNull())
    val minimumIndex = heights.lastIndexOf(heights.minOrNull())
    val swaps = maximumIndex +
            (countOfHeights - 1 - minimumIndex) -
            if (maximumIndex > minimumIndex)
                1
            else
                0
    print(swaps)
}
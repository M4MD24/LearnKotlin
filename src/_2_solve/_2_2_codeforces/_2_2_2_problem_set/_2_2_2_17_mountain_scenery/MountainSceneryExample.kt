package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_17_mountain_scenery

fun main() {
    val (
        peakCount,
        maximumModifications
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    val heights = readln()
        .split(' ')
        .map { it.toByte() }
        .toMutableList()

    var modifications = 0
    for (index in 1..<2 * peakCount step 2)
        if (
            modifications < maximumModifications &&
            heights[index] > heights[index - 1] + 1 &&
            heights[index] > heights[index + 1] + 1
        ) {
            heights[index]--
            modifications++
        }

    print(heights.joinToString(" "))
}
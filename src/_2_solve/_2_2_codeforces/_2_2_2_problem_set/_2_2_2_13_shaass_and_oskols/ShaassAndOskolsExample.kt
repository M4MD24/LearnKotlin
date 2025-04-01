package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_13_shaass_and_oskols

fun main() {
    val wireCount = readln().toByte()
    val birdCounts = readln()
        .split(' ')
        .map { it.toInt() }
        .toMutableList()
    val shotCount = readln().toByte()

    repeat(shotCount.toInt()) {
        val (
            wireIndex,
            birdPosition
        ) = readln()
            .split(' ')
            .map { it.toInt() }
        val wire = wireIndex - 1
        val birdsLeft = birdPosition - 1
        val birdsRight = birdCounts[wire] - birdPosition

        if (wire > 0)
            birdCounts[wire - 1] += birdsLeft
        if (wire < wireCount - 1)
            birdCounts[wire + 1] += birdsRight

        birdCounts[wire] = 0
    }

    birdCounts.forEach { println(it) }
}
package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_2_contest_1._2_2_1_2_g_matryoshka

import kotlin.math.min

fun main() {
    val (eyes, mouths, bodies) = readln()
        .split(' ')
        .map { it.toLong() }
    var largestNumberOfMatryoshka = minOf(eyes, mouths, bodies)
    val remainingEyes = eyes - largestNumberOfMatryoshka
    val remainingBodies = bodies - largestNumberOfMatryoshka
    largestNumberOfMatryoshka += min(remainingEyes / 2, remainingBodies)
    print(largestNumberOfMatryoshka)
}
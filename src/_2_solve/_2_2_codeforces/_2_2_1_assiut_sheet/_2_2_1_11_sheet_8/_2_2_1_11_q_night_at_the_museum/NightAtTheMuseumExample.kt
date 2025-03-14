package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_11_sheet_8._2_2_1_11_q_night_at_the_museum

import kotlin.math.abs

fun main() {
    val exhibitName = readln()
    println(minimumRotations(exhibitName))
}

private fun minimumRotations(exhibitName: String): Int {
    var currentCharacter = 'a'
    var rotations = 0
    for (character in exhibitName) {
        val difference = abs(character - currentCharacter)
        rotations += minOf(difference, 26 - difference)
        currentCharacter = character
    }
    return rotations
}
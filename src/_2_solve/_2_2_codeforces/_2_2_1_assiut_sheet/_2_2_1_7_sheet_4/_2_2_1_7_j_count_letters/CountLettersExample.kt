package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_j_count_letters

import java.util.Scanner

private val INPUT = Scanner(System.`in`)
private val TEXT: String = INPUT.next()
private val COUNTER_TEXT_LETTERS = IntArray(26)

fun main() {
    printTimesEachLetter()
}

private fun printTimesEachLetter() {
    countTimesEachLetter()
    for (index in COUNTER_TEXT_LETTERS.indices) {
        val totalTimesLetter = COUNTER_TEXT_LETTERS[index]
        if (totalTimesLetter != 0)
            println((index + 97).toChar().toString() + " : " + totalTimesLetter)
    }
}

private fun countTimesEachLetter() {
    for (element in TEXT)
        COUNTER_TEXT_LETTERS[element.code - 'a'.code]++
}
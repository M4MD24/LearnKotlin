package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_39_sort_array

import java.util.*

fun main() {
    println(getSortArray(mutableListOf(63, 12, 43, 56, 12), "B"))
    println(getSortArray(mutableListOf(88, 12, 23, 59, 1, 24), "S"))
    println(getSortArray(mutableListOf(100, 23, 200, 23, 1), "B"))
    print(getSortArray(mutableListOf(99, 88, 774, 2), "S"))
}

private fun getSortArray(numbers: MutableList<Int>, characterOperatorForSoft: String): MutableList<Int> {
    if (characterOperatorForSoft == "S")
        numbers.sort()
    else if (characterOperatorForSoft == "B")
        numbers.sortWith(Comparator.reverseOrder())
    return numbers
}
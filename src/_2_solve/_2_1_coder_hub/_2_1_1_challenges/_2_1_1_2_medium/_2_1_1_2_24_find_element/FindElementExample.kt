package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_24_find_element

fun main() {
    println(findNumber(mutableListOf(2, 12, 34, 2, 3, 4, 5), 4))
    println(findNumber(mutableListOf(3232, 1, 24, 45, 335, 454), 3554))
    println(findNumber(mutableListOf(2, 5, 6, 7, 8, 2, 1), 5))
    print(findNumber(mutableListOf(1, 5, 7, 3, 6, 1), 1))
}

private fun findNumber(numbers: MutableList<Int>, targetNumber: Int) = numbers.any { it == targetNumber }
package _2_solve._2_1_coder_hub._2_1_2_competitions._2_1_2_2_leap_25_day_2_general_trip._2_1_2_2_2_hard._2_1_2_2_2_1_search_range

fun main() = print(searchRange(mutableListOf(), 8))

private fun searchRange(numbers: MutableList<Int>, targetNumber: Int) = mutableListOf(numbers.indexOf(targetNumber), numbers.lastIndexOf(targetNumber))
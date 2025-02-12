package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_33_sort_array

fun main() {
    println(sortNumbers(mutableListOf(63, 12, 43, 56, 12)))
    println(sortNumbers(mutableListOf(88, 12, 23, 59, 1, 24)))
    println(sortNumbers(mutableListOf(100, 23, 200, 23, 1)))
    print(sortNumbers(mutableListOf(99, 88, 774, 2)))
}

private fun sortNumbers(numbers: MutableList<Int>): MutableList<Int> {
    numbers.sort()
    return numbers
}
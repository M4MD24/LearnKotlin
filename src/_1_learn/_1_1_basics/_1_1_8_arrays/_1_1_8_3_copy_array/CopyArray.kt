package _1_learn._1_1_basics._1_1_8_arrays._1_1_8_3_copy_array

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6)
    val positiveNumbers = numbers // Copying Arrays

    for (item in positiveNumbers)
        println(item)
}
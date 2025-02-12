package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_41_increasing_array

fun main() = print(increasingArray(mutableListOf(3, 2, 5, 1, 7)))

private fun increasingArray(numbers: MutableList<Int>): Int {
    var points = 0
    for (index in 1 until numbers.size)
        if (numbers[index] < numbers[index - 1]) {
            points += (numbers[index - 1] - numbers[index])
            numbers[index] = numbers[index - 1]
        }
    return points
}
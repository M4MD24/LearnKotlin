package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_34_numbers_range

fun main() = print(getNumbersToTargetNumber(readln().toInt()))

private fun getNumbersToTargetNumber(targetNumber: Int): String {
    val numbers = StringBuilder()
    for (number in 0..targetNumber) {
        numbers.append(number)
        if (number != targetNumber)
            numbers.append(' ')
    }
    return numbers.toString()
}
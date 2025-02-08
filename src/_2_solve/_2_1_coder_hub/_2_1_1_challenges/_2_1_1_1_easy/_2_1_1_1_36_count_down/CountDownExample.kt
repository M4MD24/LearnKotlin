package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_36_count_down

fun main() = print(getNumbersToTargetNumber(readln().toInt()))

private fun getNumbersToTargetNumber(targetNumber: Int): String {
    val numbers = StringBuilder()
    for (number in targetNumber downTo 0) {
        numbers.append(number)
        if (number != 0)
            numbers.append(' ')
    }
    return numbers.toString()
}
package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_73_repetitions

fun main() = print(getMaximumRepetition(readln()))

private fun getMaximumRepetition(text: String): Int {
    var max = 0
    var count = 1
    for (index in 1 until text.length) {
        count = if (text[index] == text[index - 1]) count + 1 else 1
        max = maxOf(max, count)
    }
    return maxOf(max, count)
}
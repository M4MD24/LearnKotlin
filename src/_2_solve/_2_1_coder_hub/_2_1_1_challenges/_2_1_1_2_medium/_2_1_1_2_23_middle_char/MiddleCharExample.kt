package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_23_middle_char

fun main() = print(middleChar(readln()))

private fun middleChar(text: String): String {
    val midLength = text.length / 2
    return if (text.length % 2 == 0)
        text.substring(midLength - 1, midLength + 1)
    else
        text[midLength].toString()
}
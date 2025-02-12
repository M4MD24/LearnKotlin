package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_21_has_space

fun main() = print(hasSpace(readln()))

private fun hasSpace(text: String): String = text.replace(
    ' ',
    '#'
)
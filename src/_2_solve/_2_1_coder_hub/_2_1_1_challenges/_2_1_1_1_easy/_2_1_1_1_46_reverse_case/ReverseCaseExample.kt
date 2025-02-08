package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_46_reverse_case

fun main() = print(reverseCase(readln()))

private fun reverseCase(text: String) = text.map {
    if (it.isLowerCase())
        it.uppercaseChar()
    else
        it.lowercaseChar()
}.joinToString("")
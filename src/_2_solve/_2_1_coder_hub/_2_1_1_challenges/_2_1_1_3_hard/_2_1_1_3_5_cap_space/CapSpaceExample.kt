package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_5_cap_space

fun main() = print(capSpace(readln()))

private fun capSpace(text: String) = text
    .replace(
        "([A-Z])".toRegex(),
        " $1"
    )
    .lowercase()
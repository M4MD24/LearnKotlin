package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_71_is_same

fun main() = print(isSame(readln(), readln()))

private fun isSame(firstText: String, secondText: String) = if (firstText == secondText)
    "متشابهتين"
else
    "غير متشابهتين"
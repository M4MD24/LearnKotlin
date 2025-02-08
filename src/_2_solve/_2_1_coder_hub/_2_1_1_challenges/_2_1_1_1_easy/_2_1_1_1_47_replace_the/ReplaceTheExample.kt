package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_47_replace_the

fun main() = print(replaceThe(readln()))

private fun replaceThe(text: String) = text.replace(
    "the".toRegex(),
    if (text.substring(text.indexOf("the") + 4)[0].toString().matches(".*[aAeEiIoOuU].*".toRegex()))
        "an"
    else
        "a"
)
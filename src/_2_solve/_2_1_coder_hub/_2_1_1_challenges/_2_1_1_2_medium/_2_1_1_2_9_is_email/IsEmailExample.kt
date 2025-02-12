package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_9_is_email

fun main() = print(isEmail(readln()))

private fun isEmail(text: String): Boolean {
    val emailRegex = "^[a-zA-Z0-9._-]+" +
            "@" +
            "[a-zA-Z0-9.-]+" +
            "\\." +
            "[a-zA-Z]{2,}$"
    return text.matches(emailRegex.toRegex())
}
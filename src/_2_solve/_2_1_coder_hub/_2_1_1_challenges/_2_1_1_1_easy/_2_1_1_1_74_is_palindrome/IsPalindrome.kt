package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_74_is_palindrome

fun main() = print(isPalindrome(readln()))

private fun isPalindrome(text: String): Boolean {
    var textAfterCleaned = text
    textAfterCleaned = textAfterCleaned.replace(
        "[^a-zA-Z0-9]".toRegex(),
        ""
    ).lowercase()
    return textAfterCleaned.contentEquals(StringBuilder(textAfterCleaned).reverse())
}
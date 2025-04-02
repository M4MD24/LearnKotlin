package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_5

/**
 * Write a Kotlin function that checks if a string is a palindrome or not.
 * */

fun main() {
    print("Enter Text: ")
    val text = readln()
    print("Is Text Palindrome?\n${isPalindrome(text)}")
}

private fun isPalindrome(text: String): Boolean {
    var textAfterCleaned = text
    textAfterCleaned = textAfterCleaned.replace(
        "[^a-zA-Z0-9]".toRegex(),
        ""
    ).lowercase()
    return textAfterCleaned.contentEquals(StringBuilder(textAfterCleaned).reverse())
}
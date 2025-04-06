package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_5_lambda._2_3_1_1_5_8

/**
 * Write an anonymous Kotlin function to check if a string is a palindrome.
 * */

fun main() {
    print("Enter text: ")
    val text = readln()
    val isPalindrome = { value: String -> value == value.reversed() }
    print("$text is palindrome?\n${isPalindrome(text)}")
}
package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_3

/**
 * Write a Kotlin function `countVowels` that counts the number of vowels in a given string.
 * */

fun main() {
    print("Enter Text: ")
    val text = readln()
    print("Count of Vowels: ${countVowels(text)}")
}

private fun countVowels(text: String): Int {
    val vowels = "AEIOUaeiou"
    return text.count { it in vowels }
}
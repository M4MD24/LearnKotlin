package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_5_lambda._2_3_1_1_5_11

/**
 * Write an anonymous Kotlin function to count the number of vowels in a string.
 * */

private const val VOWELS = "AEIOUaeiou"

fun main() {
    print("Enter Text: ")
    val text = readln()
    val vowelsCountOfText = { value: String -> value.count { it in VOWELS } }
    print("Vowels Count of $text: ${vowelsCountOfText(text)}")
}
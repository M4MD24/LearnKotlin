package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_5_lambda._2_3_1_1_5_13

/**
 * Write an anonymous Kotlin function to concatenate two strings and return the result.
 * */

fun main() {
    print("Enter First Text: ")
    val firstText = readln()
    print("Enter Second Text: ")
    val secondText = readln()
    val concatenatedText = { firstValue: String, secondValue: String -> firstValue + secondValue }
    print("Concatenated Texts: ${concatenatedText(firstText, secondText)}")
}
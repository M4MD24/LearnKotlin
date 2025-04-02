package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_4

/**
 * Write a Kotlin function that reverses a given string.
 * */

fun main() {
    print("Enter Text: ")
    val text = readln()
    print("Reversed Text: ${reversedText(text)}")
}

private fun reversedText(text: String) = text.reversed()
package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_6

/**
 * Write a Kotlin function that prints a message and does not return anything.
 * */

fun main() {
    print("Enter Text: ")
    val text = readln()
    printText(text)
}

private fun printText(text: String) = print("Entered Text: $text")
package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_4_recursion._2_3_1_1_4_5

/**
 * Write a Kotlin recursive function to generate all permutations of a given string.
 * */

fun main() {
    print("Enter Text: ")
    val text = readln()
    printPermutationsTexts(text)
}

private fun printPermutationsTexts(
    text: String,
    prefix: String = ""
) {
    if (text.isEmpty())
        println(prefix)
    else
        text.forEachIndexed { index, character ->
            printPermutationsTexts(
                text.removeRange(
                    index,
                    index + 1
                ),
                prefix + character
            )
        }
}
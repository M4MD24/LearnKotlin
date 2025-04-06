package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_5_lambda._2_3_1_1_5_5

/**
 * Write a Kotlin program that implements a lambda expression to filter a list of strings. It returns only strings starting with the letter 'K'.
 * */

fun main() {
    val words = listOf("Kotlin", "Java", "Kubernetes", "Python", "C++")
    val wordsStartingWithLetterK: (List<String>) -> List<String> = { values -> values.filter { it.startsWith("K") } }
    print("Words starting with letter 'K': ${wordsStartingWithLetterK(words)}")
}
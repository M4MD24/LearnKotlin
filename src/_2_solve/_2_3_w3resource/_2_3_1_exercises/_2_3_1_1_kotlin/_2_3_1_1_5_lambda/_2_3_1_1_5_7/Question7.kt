package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_5_lambda._2_3_1_1_5_7

/**
 * Write a Kotlin program that implements a lambda expression to convert a list of strings to uppercase.
 * */

fun main() {
    val words = listOf("Kotlin", "Java", "Kubernetes", "Python", "C++")
    val uppercaseWords: (List<String>) -> List<String> = { values -> values.map { it.uppercase() } }
    print("Uppercase Words: ${uppercaseWords(words)}")
}
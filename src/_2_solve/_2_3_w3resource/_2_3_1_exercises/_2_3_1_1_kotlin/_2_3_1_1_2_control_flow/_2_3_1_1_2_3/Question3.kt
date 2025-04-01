package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_2_control_flow._2_3_1_1_2_3

/**
 * Write a Kotlin program to check if a given character is a vowel or a consonant.
 * */

const val VOWELS = "AEIOUaeiou"

fun main() {
    print("Enter Letter: ")
    val letter = readln()[0]
    print(
        "Letter Status: ${
            if (letter in VOWELS)
                "Vowel"
            else if (letter.isLetter())
                "Constant"
            else
                "Other"
        }"
    )
}
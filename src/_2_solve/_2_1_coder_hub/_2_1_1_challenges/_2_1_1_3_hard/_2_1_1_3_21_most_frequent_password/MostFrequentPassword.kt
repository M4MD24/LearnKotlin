package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_21_most_frequent_password

import kotlin.collections.mutableMapOf
import kotlin.collections.maxOrNull

fun mostFrequentPassword(passwords: MutableList<String>): String {
    if (passwords.isEmpty())
        return ""
    val frequencyMap = mutableMapOf<String, Int>()
    for (password in passwords)
        frequencyMap[password] = frequencyMap.getOrDefault(password, 0) + 1
    val maximumFrequency = frequencyMap.values.maxOrNull() ?: return ""
    return frequencyMap.filter { it.value == maximumFrequency }
        .keys
        .minOrNull() ?: ""
}

fun main() {
    val testCases = mutableListOf(
        mutableListOf("1234", "admin", "1234", "root", "admin", "1234"),
        mutableListOf("qwe", "qwe", "asd", "asd"),
        mutableListOf("pass", "pass", "word", "word", "test"),
        mutableListOf("z", "y", "x", "z", "y", "x")
    )

    for (testCase in testCases)
        println(mostFrequentPassword(testCase))
}
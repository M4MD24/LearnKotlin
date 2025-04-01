package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_14_yaroslav_and_permutations

fun main() {
    val arraySize = readln().toByte()
    val numbers = readln()
        .split(' ')
        .map { it.toShort() }
    val frequencyMap = numbers
        .groupingBy { it }
        .eachCount()
    val maximumFrequency = frequencyMap
        .values
        .maxOrNull() ?: 0
    print(
        if (maximumFrequency <= (arraySize + 1) / 2)
            "YES"
        else
            "NO"
    )
}
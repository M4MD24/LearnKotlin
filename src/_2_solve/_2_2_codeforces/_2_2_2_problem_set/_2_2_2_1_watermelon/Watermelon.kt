package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_1_watermelon

fun main() {
    val targetNumber = readln().toByte()
    print(
        if (
            targetNumber % 2 == 0 &&
            targetNumber > 3
        )
            "YES"
        else
            "NO"
    )
}
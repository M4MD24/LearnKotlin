package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_8_helpful_maths

fun main() {
    val expression = readln()
    print(
        expression
            .split('+')
            .sorted()
            .joinToString("+")
    )
}
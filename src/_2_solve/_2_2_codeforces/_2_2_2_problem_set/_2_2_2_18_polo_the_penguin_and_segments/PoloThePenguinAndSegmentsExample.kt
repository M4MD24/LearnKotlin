package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_18_polo_the_penguin_and_segments

fun main() {
    val (
        numberSegments,
        divisor
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val segments = List(numberSegments) {
        readln()
            .split(' ')
            .map { it.toInt() }
    }

    val totalLength = segments.sumOf { (left, right) -> right - left + 1 }
    val remainder = totalLength % divisor

    print(
        if (remainder == 0)
            0
        else
            divisor - remainder
    )
}
package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_4_colorful_stones_simplified_edition

fun main() {
    val stones = readln()
    val instructions = readln()
    var index = 0
    for (instruction in instructions)
        if (
            index < stones.length &&
            stones[index] == instruction
        )
            index++
    print(index + 1)
}
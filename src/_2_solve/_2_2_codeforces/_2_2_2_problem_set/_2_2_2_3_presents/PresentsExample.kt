package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_3_presents

fun main() {
    val countOfPresents = readln().toByte()
    val presents = ByteArray(101)
    readln()
        .split(' ')
        .mapIndexed { index, value ->
            presents[value.toInt()] = (index + 1).toByte()
        }
    for (index in 1..countOfPresents)
        print("${presents[index]} ")
}
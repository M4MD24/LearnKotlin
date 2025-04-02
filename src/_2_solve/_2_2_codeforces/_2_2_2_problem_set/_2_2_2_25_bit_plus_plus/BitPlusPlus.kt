package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_25_bit_plus_plus

fun main() {
    val statementCount = readln().toShort()
    var value = 0
    repeat(statementCount.toInt()) {
        val statement = readln()
        if ("+" in statement)
            value++
        else
            value--
    }
    print(value)
}
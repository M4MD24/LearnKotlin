package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_5_lucky_division

fun main() {
    val number = readln().toShort()
    print(
        if (divisibleByLuckyNumbers(number))
            "YES"
        else
            "NO"
    )
}

private fun divisibleByLuckyNumbers(number: Short) = (
        number % 4 == 0 ||
                number % 7 == 0 ||
                number % 44 == 0 ||
                number % 47 == 0 ||
                number % 74 == 0 ||
                number % 77 == 0 ||
                number % 444 == 0 ||
                number % 447 == 0 ||
                number % 474 == 0 ||
                number % 744 == 0 ||
                number % 477 == 0 ||
                number % 747 == 0 ||
                number % 774 == 0 ||
                number % 777 == 0
        )

// >
/*
fun main() {
    val number = readln().toShort()
    val luckyNumbers = (1..1000)
        .filter {
            it.toString()
                .all { character -> character == '4' || character == '7' }
        }
    print(
        if (luckyNumbers.any { number % it == 0 })
            "YES"
        else
            "NO"
    )
}
*/
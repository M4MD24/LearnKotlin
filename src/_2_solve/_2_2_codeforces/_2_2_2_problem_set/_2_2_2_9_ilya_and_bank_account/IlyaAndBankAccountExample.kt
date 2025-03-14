package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_9_ilya_and_bank_account

fun main() {
    val number = readln().toInt()
    print(
        if (number >= 0)
            number
        else {
            val lastDigit = number / 10
            val beforeLastDigit = (number / 100) * 10 + (number % 10)
            maxOf(
                lastDigit,
                beforeLastDigit
            )
        }
    )
}
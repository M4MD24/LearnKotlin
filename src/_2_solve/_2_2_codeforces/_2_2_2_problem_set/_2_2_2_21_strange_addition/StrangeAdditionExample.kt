package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_21_strange_addition

fun main() {
    val countOfNumbers = readln().toByte()
    val numbers = readln()
        .split(' ')
        .map { it.toByte() }
    val selectedNumbers = mutableListOf<Byte>()
    var singleDigitAllowed = true
    var multipleOfTenAllowed = true

    for (number in numbers)
        when {
            number == 0.toByte() || number == 100.toByte() -> selectedNumbers.add(number)

            number in 1..9 && singleDigitAllowed -> {
                selectedNumbers.add(number)
                singleDigitAllowed = false
            }

            number % 10 == 0 && multipleOfTenAllowed -> {
                selectedNumbers.add(number)
                multipleOfTenAllowed = false
            }
        }

    if (
        singleDigitAllowed &&
        multipleOfTenAllowed
    )
        for (number in numbers)
            if (number in 10..99) {
                selectedNumbers.add(number)
                break
            }

    print("${selectedNumbers.size}\n${selectedNumbers.joinToString(" ")}")
}
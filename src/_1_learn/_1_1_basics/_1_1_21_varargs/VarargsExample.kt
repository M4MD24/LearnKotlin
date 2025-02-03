package _1_learn._1_1_basics._1_1_21_varargs

/* Varargs is like a Array ! */
fun main() {
    val FIRST_NUMBER = 1
    val SECOND_NUMBER = 2
    val THIRD_NUMBER = 3
    val FOURTH_NUMBER = 4
    val FIFTH_NUMBER = 5
    val SIXTH_NUMBER = 6

    add(FIRST_NUMBER, SECOND_NUMBER)
    add(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER)
    add(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER, FOURTH_NUMBER, FIFTH_NUMBER)
    add(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER, FOURTH_NUMBER, FIFTH_NUMBER, SIXTH_NUMBER)
}

private fun add(vararg NUMBERS: Int) {
    var sum = 0
    val EXPRESSION = StringBuilder()
    for (index in NUMBERS.indices) {
        sum += NUMBERS[index]
        EXPRESSION.append(NUMBERS[index])
        if (index < NUMBERS.size - 1)
            EXPRESSION.append(" + ")
    }
    println("$EXPRESSION = $sum")
}
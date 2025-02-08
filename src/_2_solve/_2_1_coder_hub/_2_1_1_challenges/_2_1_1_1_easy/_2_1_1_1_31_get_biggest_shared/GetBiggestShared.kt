package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_31_get_biggest_shared

fun main() {
    println(getLastElement(mutableListOf(1, 2, 4, 5), mutableListOf(3, 4, 7, 11)))
    println(getLastElement(mutableListOf(0), mutableListOf(0)))
    println(getLastElement(mutableListOf(90, 95), mutableListOf(90, 95)))
    print(getLastElement(mutableListOf(10, 2, 3, 12, 3), mutableListOf(54, 12, 33, 1)))
}

private fun getLastElement(firstNumbers: MutableList<Int>, secondNumbers: MutableList<Int>): Int {
    firstNumbers.sort()
    secondNumbers.sort()
    for (indexOfFirstNumbers in firstNumbers.size - 1 downTo 0) {
        val firstNumber = firstNumbers[indexOfFirstNumbers]
        for (indexOfSecondNumbers in secondNumbers.size - 1 downTo 0) {
            val secondNumber = secondNumbers[indexOfSecondNumbers]
            if (firstNumber == secondNumber)
                return firstNumber
        }
    }
    return -1
}
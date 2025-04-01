package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_2_control_flow._2_3_1_1_2_9

/**
 * Write a Kotlin program to count the number of even and odd elements in an array.
 * */

fun main() {
    print("Enter Count of Numbers: ")
    val countOfNumbers = readln().toInt()

    val numbers = mutableListOf<Int>()
    for (index in 0..countOfNumbers) {
        print("Enter Number at Index $index: ")
        val number = readln().toInt()
        numbers.add(number)
    }

    print(
        """
        Count of Even Numbers in Numbers: ${numbers.count { isEven(it) }}
        Count of Odd Numbers in Numbers: ${numbers.count { !isEven(it) }}""".trimIndent()
    )
}

private fun isEven(number: Int) = number % 2 == 0
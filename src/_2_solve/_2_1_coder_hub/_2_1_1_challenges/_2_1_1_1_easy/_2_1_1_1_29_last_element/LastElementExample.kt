package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_29_last_element

fun main() {
    println(getLastElement(mutableListOf(42, 32, 42, 11, 30)))
    println(getLastElement(mutableListOf(34, 2, 23, 545, 6)))
    println(getLastElement(mutableListOf(5, 645, 3, 34, 5, 7, 0)))
    print(getLastElement(mutableListOf(3, 4, 5, 6, 1, 4, 6)))
}

private fun getLastElement(numbers: MutableList<Int>) = numbers[numbers.size - 1]
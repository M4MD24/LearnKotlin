package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_61_number_elements

fun main() {
    println(numberElements(mutableListOf(5, 12, 3, 51)))
    println(numberElements(mutableListOf(19, 12)))
    println(numberElements(mutableListOf(10, 24, 45, 123, 124, 982, 51, 42, 124, 19)))
    print(numberElements(mutableListOf(10)))
}

private fun numberElements(numbers: MutableList<Int>) = numbers.size
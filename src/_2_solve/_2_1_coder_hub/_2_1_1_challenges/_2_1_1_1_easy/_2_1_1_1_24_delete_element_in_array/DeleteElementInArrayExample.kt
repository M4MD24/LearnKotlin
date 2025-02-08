package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_24_delete_element_in_array

fun main() {
    println(deleteNumberByIndex(mutableListOf(2, 3, 2, 3), 2))
    println(deleteNumberByIndex(mutableListOf(10, 5, 9, 5), 0))
    println(deleteNumberByIndex(mutableListOf(6, 3, 12, 12), 1))
    print(deleteNumberByIndex(mutableListOf(3, -9, -9, -4), 0))
}

private fun deleteNumberByIndex(numbers: MutableList<Int>, index: Int): MutableList<Int> {
    numbers.removeAt(index)
    return numbers
}
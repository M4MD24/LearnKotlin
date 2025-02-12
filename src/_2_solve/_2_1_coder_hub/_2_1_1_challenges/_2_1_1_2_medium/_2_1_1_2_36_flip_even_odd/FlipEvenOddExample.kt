package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_36_flip_even_odd

fun main() {
    println(arrayRoot(mutableListOf(73, 221, 52, 214)))
    println(arrayRoot(mutableListOf(12, 9, 25, 6, 12, 19)))
    println(arrayRoot(mutableListOf(1, 23, 46, 2, 4)))
    print(arrayRoot(mutableListOf(6, 5, 100, 0)))
}

private fun arrayRoot(numbers: MutableList<Int>): MutableList<Int> {
    for (index in numbers.indices)
        if (numbers[index] % 2 == 0)
            numbers[index]++
        else
            numbers[index]--
    return numbers
}
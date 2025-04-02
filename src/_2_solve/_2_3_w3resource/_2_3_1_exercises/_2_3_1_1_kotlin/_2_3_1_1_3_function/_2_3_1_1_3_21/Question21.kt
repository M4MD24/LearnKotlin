package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_21

/**
 * Write a Kotlin generic function that swaps the values of two variables.
 * */

fun main() {
    val numbers = arrayOf(123, 456)
    printSwap(numbers)
    println('\n' + "-".repeat(10))
    val characters = arrayOf('A', 'B')
    printSwap(characters)
    println('\n' + "-".repeat(10))
    val texts = arrayOf("ABC", "DEF")
    printSwap(texts)
}

private fun <T> printSwap(things: Array<T>) {
    require(things.size == 2) { "Array must contain exactly two elements" }
    println(
        """
        Before Swap
        First Thing: ${things[0]}
        Second Thing: ${things[1]}""".trimIndent()
    )
    things[0] = things[1].also { things[1] = things[0] }
    print(
        """
        After Swap
        First Thing: ${things[0]}
        Second Thing: ${things[1]}""".trimIndent()
    )
}
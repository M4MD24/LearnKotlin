package _1_learn._1_1_basics._1_1_9_flow_control._1_9_3_loops._1_9_3_3_for_each

fun main() {
    val NUMBERS = arrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)

    println("Ascending Range (Inclusive)")
    var sum = 0
    for (number in NUMBERS)
        sum += number
    println("Sum = $sum")

    println("Descending Range with Step")
    for (index in 10 downTo 1 step 2)
        println(index)

    println()

    println("Iterating over List")
    for (num in NUMBERS)
        println(num)

    println()

    println("Iterating over List by Indices")
    for (index in NUMBERS.indices)
        println("Index: $index, Value: ${NUMBERS[index]}")

    println()

    println("Using forEach to iterate")
    NUMBERS.forEach { println(it) }

    println()

    println("Using forEachIndexed to iterate with index")
    NUMBERS.forEachIndexed { index, value ->
        println("Index: $index, Value: $value")
    }
}
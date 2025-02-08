package _1_learn._1_4_data_structures._1_4_14_triple

fun main() {
    val number: Triple<Int, String, Boolean> = Triple(1, "One", true)
    println("Original Number: $number")

    // First, second, and third values
    println("First: ${number.first}")
    println("Second: ${number.second}")
    println("Third: ${number.third}")

    // Convert to list
    println("As List: ${listOf(number.first, number.second, number.third)}")

    // Convert to string
    println("As String: ${number.toString()}")

    // Destructuring declaration
    val (first, second, third) = number
    print("Destructed - First: $first, Second: $second, Third: $third")
}
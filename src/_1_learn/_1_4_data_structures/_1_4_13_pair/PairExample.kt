package _1_learn._1_4_data_structures._1_4_13_pair

fun main() {
    val number: Pair<Int, String> = Pair(1, "One")
    println("Original Number: $number")

    // First and second values
    println("First: ${number.first}")
    println("Second: ${number.second}")

    // Convert to list
    println("As List: ${listOf(number.first, number.second)}")

    // Convert to string
    println("As String: ${number.toString()}")

    // Destructuring declaration
    val (key, value) = number
    print("Destructed - Key: $key, Value: $value")
}
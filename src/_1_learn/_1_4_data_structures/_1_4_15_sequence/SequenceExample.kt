package _1_learn._1_4_data_structures._1_4_15_sequence

fun main() {
    val numbers: Sequence<Int> = sequenceOf(1, 2, 3, 4, 5, 5, 5)
    println("Original Numbers: ${numbers.toList()}")

    // Map operation
    println("Mapped Sequence: ${numbers.map { it * 2 }.toList()}")

    // Filter operation
    println("Filtered Sequence (even numbers): ${numbers.filter { it % 2 == 0 }.toList()}")

    // Take first n elements
    println("First 3 elements: ${numbers.take(3).toList()}")

    // Drop first n elements
    println("After dropping first 2 elements: ${numbers.drop(2).toList()}")

    // Fold operation
    println("Sum using fold: ${numbers.fold(0) { accumulator, index -> accumulator + index }}")

    // Reduce operation
    println("Sum using reduce: ${numbers.reduce { accumulator, index -> accumulator + index }}")

    // Find first element
    println("First element: ${numbers.first()}")

    // Find last element
    println("Last element: ${numbers.last()}")

    // Find element at index
    println("Element at index 2: ${numbers.elementAt(2)}")

    // Convert to list
    println("As List: ${numbers.toList()}")

    // Convert to set
    println("As Set: ${numbers.toSet()}")

    // Convert to string
    print("As String: ${numbers.joinToString(", ")}")
}
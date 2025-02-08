package _1_learn._1_4_data_structures._1_4_6_mutable_set

fun main() {
    val numbers: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
    println("Original Numbers: $numbers")

    // Size of the set
    println("Size: ${numbers.size}")

    // Check if set contains an element
    println("Contains 3: ${numbers.contains(3)}")

    // First and last elements (sorted)
    println("First: ${numbers.minOrNull()}")
    println("Last: ${numbers.maxOrNull()}")

    // Convert to sorted list
    println("Sorted: ${numbers.sorted()}")

    // Sum of elements
    println("Sum: ${numbers.sum()}")

    // Average of elements
    println("Average: ${numbers.average()}")

    // Map transformation
    println("Doubled: ${numbers.map { it * 2 }}")

    // Filter elements
    println("Even numbers: ${numbers.filter { it % 2 == 0 }}")

    // Any and all
    println("Any element > 3: ${numbers.any { it > 3 }}")
    println("All elements > 0: ${numbers.all { it > 0 }}")

    // Count elements satisfying condition
    println("Count of elements > 2: ${numbers.count { it > 2 }}")

    // Add elements
    numbers.add(6)
    println("After adding 6: $numbers")

    // Remove element
    numbers.remove(3)
    println("After removing 3: $numbers")

    // Take and drop (converted to list)
    println("First 3 elements: ${numbers.toList().take(3)}")
    println("Drop first 2 elements: ${numbers.toList().drop(2)}")

    // Join to string
    print("Joined: ${numbers.joinToString(" - ")}")
}
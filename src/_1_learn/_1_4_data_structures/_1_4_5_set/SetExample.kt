package _1_learn._1_4_data_structures._1_4_5_set

fun main() {
    val numbers: Set<Int> = setOf(1, 2, 3, 4, 5)
    println("Original Numbers: $numbers")

    // Size of the set
    println("Size: ${numbers.size}")

    // Check if set contains an element
    println("Contains 3: ${numbers.contains(3)}")

    // First and last elements
    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")

    // Check if empty
    println("Is empty: ${numbers.isEmpty()}")

    // Convert to list
    println("As List: ${numbers.toList()}")

    // Convert to mutable set
    val mutableSet = numbers.toMutableSet()
    mutableSet.add(6)
    println("Mutable Set after adding 6: ${mutableSet.joinToString()}")

    // Remove element
    mutableSet.remove(3)
    println("Mutable Set after removing 3: ${mutableSet.joinToString()}")

    // Union of sets
    val anotherSet = setOf(4, 5, 6, 7)
    println("Union with another set: ${numbers union anotherSet}")

    // Intersection of sets
    println("Intersection with another set: ${numbers intersect anotherSet}")

    // Difference of sets
    println("Difference from another set: ${numbers subtract anotherSet}")

    // Filter elements
    println("Even numbers: ${numbers.filter { it % 2 == 0 }}")

    // Any and all
    println("Any element > 3: ${numbers.any { it > 3 }}")
    println("All elements > 0: ${numbers.all { it > 0 }}")

    // Count elements satisfying condition
    println("Count of elements > 2: ${numbers.count { it > 2 }}")

    // Map transformation
    println("Doubled: ${numbers.map { it * 2 }}")

    // Join to string
    print("Joined: ${numbers.joinToString(" - ")}")
}
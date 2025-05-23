package _1_learn._1_4_data_structures._1_4_9_map

fun main() {
    val numbers: Map<Int, String> = mapOf(
        1 to "One",
        2 to "Two",
        3 to "Three",
        4 to "Four",
        5 to "Five"
    )
    println("Original Numbers: $numbers")

    // Size of the map
    println("Size: ${numbers.size}")

    // Check if map contains a key
    println("Contains key 3: ${numbers.containsKey(3)}")

    // Check if map contains a value
    println("Contains value 'Three': ${numbers.containsValue("Three")}")

    // Get value by key
    println("Value for key 2: ${numbers[2]}")

    // Get keys
    println("Keys: ${numbers.keys}")

    // Get values
    println("Values: ${numbers.values}")

    // Convert to sorted list of entries
    println("Sorted by key: ${numbers.toSortedMap()}")

    // Iterate through map
    numbers.forEach { (key, value) -> println("Key: $key, Value: $value") }

    // Filter keys
    println("Filtered (keys > 2): ${numbers.filterKeys { it > 2 }}")

    // Filter values
    println("Filtered (values start with 'T'): ${numbers.filterValues { it.startsWith("T") }}")

    // Map transformation
    println("Mapped Values (uppercase): ${numbers.mapValues { it.value.uppercase() }}")

    // Convert to list of pairs
    println("As List: ${numbers.toList()}")

    // Join to string
    print("Joined: ${numbers.entries.joinToString { "${it.key} -> ${it.value}" }}")
}
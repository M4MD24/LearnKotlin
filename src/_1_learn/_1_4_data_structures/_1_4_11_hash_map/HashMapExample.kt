package _1_learn._1_4_data_structures._1_4_11_hash_map

fun main() {
    val numbers: HashMap<Int, String> = hashMapOf(
        1 to "One",
        2 to "Two",
        3 to "Three",
        4 to "Four",
        5 to "Five",
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
    println("Joined: ${numbers.entries.joinToString { "${it.key} -> ${it.value}" }}")

    // Add a new key-value pair
    numbers[6] = "Six"
    println("Adding key 6: $numbers")

    // Remove a key
    numbers.remove(3)
    println("Removing key 3: $numbers")

    // Replace a value
    numbers[2] = "Two Updated"
    println("Updating key 2: $numbers")

    // Merge values
    numbers.merge(4, "Four Updated") { old, new -> "$old & $new" }
    println("Merging key 4: $numbers")

    // Clear map
    numbers.clear()
    print("Clearing: $numbers")
}
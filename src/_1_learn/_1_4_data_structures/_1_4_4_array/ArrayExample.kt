package _1_learn._1_4_data_structures._1_4_4_array

fun main() {
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println("Original Numbers: $numbers")

    // Size of the array
    println("Size: ${numbers.size}")

    // Get element at index
    println("Element at index 2: ${numbers[2]}")

    // First and last elements
    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")

    // Check if array contains an element
    println("Contains 3: ${numbers.contains(3)}")

    // Index of an element
    println("Index of 4: ${numbers.indexOf(4)}")

    // Last index of an element
    println("Last index of 3: ${numbers.lastIndexOf(3)}")

    // Get sub-array
    println("Slice: ${numbers.slice(1..3)}")

    // Reverse array
    println("Reversed: ${numbers.reversed()}")

    // Sort array
    println("Sorted: ${numbers.sorted()}")

    // Min and Max values
    println("Min: ${numbers.minOrNull()}")
    println("Max: ${numbers.maxOrNull()}")

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

    // Fold and reduce
    println("Fold sum starting with 10: ${numbers.fold(10) { accumulator, index -> accumulator + index }}")
    println("Reduce sum: ${numbers.reduce { accumulator, index -> accumulator + index }}")

    // Join to string
    println("Joined: ${numbers.joinToString(" - ")}")

    // Copy array
    val copiedArray = numbers.copyOf()
    println("Copied Array: ${copiedArray.joinToString()}")

    // Fill array
    val filledArray = numbers.copyOf()
    filledArray.fill(0)
    println("Filled with 0: ${filledArray.joinToString()}")

    // Convert to list
    println("As List: ${numbers.toList()}")

    // Shuffle array
    val shuffledArray = numbers.copyOf()
    shuffledArray.shuffle()
    println("Shuffled: ${shuffledArray.joinToString()}")

    // Take and drop
    println("First 3 elements: ${numbers.take(3)}")
    print("Drop first 2 elements: ${numbers.drop(2)}")
}
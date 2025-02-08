package _1_learn._1_4_data_structures._1_4_3_array_list

fun main() {
    val numbers: ArrayList<Int> = arrayListOf(1, 2, 3, 4, 5)
    println("Original numbers: $numbers")

    // Adding elements
    numbers.add(6)
    println("add(6): $numbers")

    numbers.add(1, 10)
    println("add(1, 10): $numbers")

    numbers.addAll(arrayListOf(7, 8, 9))
    println("addAll(arrayListOf(7, 8, 9)): $numbers")

    numbers.addAll(2, arrayListOf(11, 12))
    println("addAll(2, arrayListOf(11, 12)): $numbers")

    // Removing elements
    numbers.remove(10)
    println("remove(10): $numbers")

    numbers.removeAt(3)
    println("removeAt(3): $numbers")

    numbers.removeAll(arrayListOf(7, 8))
    println("removeAll(arrayListOf(7, 8)): $numbers")

    numbers.retainAll(arrayListOf(1, 2, 3, 4, 5, 6))
    println("retainAll(arrayListOf(1, 2, 3, 4, 5, 6)): $numbers")

    numbers.clear()
    println("clear(): $numbers")

    // Re-populating the list
    numbers.addAll(arrayListOf(5, 3, 1, 4, 2))
    println("Re-populated list: $numbers")

    // Sorting
    numbers.sort()
    println("sort(): $numbers")

    numbers.shuffle()
    println("shuffle(): $numbers")

    numbers.reverse()
    println("reverse(): $numbers")

    // Updating elements
    numbers[2] = 99
    println("list[2] = 99: $numbers")

    numbers.fill(7)
    print("fill(7): $numbers")
}
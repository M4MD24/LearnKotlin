package _1_learn._1_4_data_structures._1_4_1_list

fun main() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5) // Immutable List
    println("Original Numbers: $numbers")

    // Accessing Elements
    println("get(0): ${numbers.get(0)}")
    println("list[1]: ${numbers[1]}")
    println("first(): ${numbers.first()}")
    println("last(): ${numbers.last()}")
    println("elementAt(2): ${numbers.elementAt(2)}")
    println("elementAtOrNull(10): ${numbers.elementAtOrNull(10)}")
    println("elementAtOrElse(10) { -1 }: ${numbers.elementAtOrElse(10) { -1 }}")
    println("subList(1, 4): ${numbers.subList(1, 4)}")

    // Searching
    println("indexOf(3): ${numbers.indexOf(3)}")
    println("lastIndexOf(3): ${numbers.lastIndexOf(3)}")
    println("contains(2): ${numbers.contains(2)}")
    println("containsAll(listOf(1, 2)): ${numbers.containsAll(listOf(1, 2))}")
    println("isEmpty(): ${numbers.isEmpty()}")
    println("isNotEmpty(): ${numbers.isNotEmpty()}")

    // Transformations
    println("map { it * 2 }: ${numbers.map { it * 2 }}")
    println("filter { it % 2 == 0 }: ${numbers.filter { it % 2 == 0 }}")
    println("sorted(): ${numbers.sorted()}")
    println("sortedDescending(): ${numbers.sortedDescending()}")
    println("reversed(): ${numbers.reversed()}")
    println("distinct(): ${numbers.distinct()}")
    println("flatMap { listOf(it, it * 10) }: ${numbers.flatMap { listOf(it, it * 10) }}")

    // Aggregations
    println("count(): ${numbers.count()}")
    println("sum(): ${numbers.sum()}")
    println("average(): ${numbers.average()}")
    println("minOrNull(): ${numbers.minOrNull()}")
    println("maxOrNull(): ${numbers.maxOrNull()}")
    println("reduce { accumulator, index -> accumulator + index }: ${numbers.reduce { accumulator, index -> accumulator + index }}")
    print("fold(10) { accumulator, index -> accumulator + index }: ${numbers.fold(10) { accumulator, index -> accumulator + index }}")
}

package _1_learn._1_1_basics._1_1_9_flow_control._1_9_3_loops._1_9_3_2_for

fun main() {
    println("Ascending Range (Inclusive)")
    for (index in 1..10)
        println(index)

    println()

    println("Descending Range")
    for (index in 10 downTo 1)
        println(index)

    println()

    println("Exclusive Range (Excludes last element)")
    for (index in 1..<10)
        println(index)

    println()

    println("Exclusive Range (Excludes last element) | (Another Solution)")
    for (index in 1 until 10)
        println(index)

    println()

    println("Range with Step")
    for (index in 1..10 step 2)
        println(index)
}
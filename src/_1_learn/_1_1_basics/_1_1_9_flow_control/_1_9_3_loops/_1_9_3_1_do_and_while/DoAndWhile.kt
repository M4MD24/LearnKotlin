package _1_learn._1_1_basics._1_1_9_flow_control._1_9_3_loops._1_9_3_1_do_and_while

fun main() {
    var index = 0
    val stopIn = 10

    // While with shorthand
    while (index < stopIn) println("While With Shorthand = " + ++index)

    println()

    // While  without shorthand
    while ((index <= stopIn) && (index != 1)) {
        println("While Without Shorthand = " + --index)
    }

    println()

    // Do-While with shorthand
    do println("Do-While With Shorthand = " + ++index)
    while (index < stopIn)

    println()

    // Do-While without shorthand
    do {
        println("Do-While Without Shorthand = " + --index)
    } while ((index <= stopIn) && (index != 1))
}
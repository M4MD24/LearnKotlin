package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_3

/**
 * Write a Kotlin object-oriented program that creates a sealed class Result with subclasses Success and Error to represent the result of an operation. Use pattern matching to handle different result types.
 * */

fun main() {
    val operation = Operation()
    handleResult(operation.divide(10, 2))
    handleResult(operation.divide(10, 0))
}
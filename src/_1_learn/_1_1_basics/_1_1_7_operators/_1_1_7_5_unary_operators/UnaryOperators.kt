package _1_learn._1_1_basics._1_1_7_operators._1_1_7_5_unary_operators

fun main() {
    /* Unary Operators Types! */
    /* ( + ) Unary plus
     * ( - ) Unary minus
     * ( ++ ) Increment
     * ( -- ) Decrement
     * ( ~ ) Bitwise NOT
     * ( ! ) Logical NOT
     * */

    var intVariable = 1
    println(+intVariable) // Unary plus
    println(-intVariable) // Unary minus
    println(++intVariable) // Increment
    println(--intVariable) // Decrement
    println(intVariable.inv()) // Bitwise NOT

    val booleanVariable = false
    println(!booleanVariable) // Logical NOT
}
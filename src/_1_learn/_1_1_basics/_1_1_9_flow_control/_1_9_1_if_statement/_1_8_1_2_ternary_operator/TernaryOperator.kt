package _1_learn._1_1_basics._1_1_9_flow_control._1_9_1_if_statement._1_8_1_2_ternary_operator

fun main() {
    val number = 5
    var result = 0

    // Without Ternary Operator
    if (number == result)
        result = 20
    else
        result = 10

    // With Ternary Operator
    result = if (number == result) 20 else 10

    println(result)
}
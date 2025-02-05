package _1_learn._1_1_basics._1_3_23_higher_order_function

fun operateOnNumbers(
    a: Int,
    b: Int,
    operation: (Int, Int) -> Int
): Int {
    return operation(a, b)
}

fun main() {
    val sum = operateOnNumbers(5, 3, { firstNumber, secondNumber -> firstNumber + secondNumber })
    val multiply = operateOnNumbers(5, 3) { firstNumber, secondNumber -> firstNumber * secondNumber }

    println("Sum: $sum")
    println("Multiply: $multiply")
}
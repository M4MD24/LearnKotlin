package _1_learn._1_1_basics._1_1_13_expressions._1_1_13_1_lambda_expressions

fun main() {
    // lambda expression
    val value = MyInterface { 3.1415 }
    println(value.getValue())

    val secondValue = { firstNumber: Int, secondNumber: Int -> firstNumber + secondNumber }
    println(secondValue(2, 3))

    val thirdValue: (Int, Int) -> Int = { firstNumber: Int, secondNumber: Int -> firstNumber + secondNumber }
    println(thirdValue(2, 3))
}

fun interface MyInterface {
    fun getValue(): Double
}
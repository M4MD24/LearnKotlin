package _1_learn._1_1_basics._1_1_13_expressions._1_1_13_1_lambda_expressions

fun main() {
    // lambda expression
    val ref = MyInterface { 3.1415 }

    println(ref.getValue())
}

internal fun interface MyInterface {
    fun getValue(): Double
}
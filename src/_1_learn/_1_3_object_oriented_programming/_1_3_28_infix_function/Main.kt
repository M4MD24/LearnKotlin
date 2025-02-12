package _1_learn._1_3_object_oriented_programming._1_3_28_infix_function

fun main() {
    val num1 = 10
    val num2 = 2

    if (num1 isDivisibleBy num2)
        println("$num1 is divisible by $num2")
    else
        println("$num1 is not divisible by $num2")
}

infix fun Int.isDivisibleBy(divisor: Int): Boolean = this % divisor == 0
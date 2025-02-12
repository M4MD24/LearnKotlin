package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_2_math_expression

fun main() = print(mathExpression(readln()))

fun mathExpression(mathExpression: String) = mathExpression.matches("\\d+[-+*/]\\d+".toRegex())
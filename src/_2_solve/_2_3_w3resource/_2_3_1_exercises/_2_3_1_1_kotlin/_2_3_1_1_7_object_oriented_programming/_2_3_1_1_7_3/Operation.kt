package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_3

class Operation {
    fun divide(
        firstNumber: Int,
        secondNumber: Int
    ): Result<Int> = if (secondNumber == 0)
        Result.Error("Division by zero is not allowed.")
    else
        Result.Success(firstNumber / secondNumber)
}
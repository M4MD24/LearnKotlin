package _1_learn._1_3_object_oriented_programming._1_3_21_keywords._1_3_21_3_sealed._1_3_21_3_1_class

sealed class Result
class Success(val data: String) : Result()
class Error(val message: String) : Result()

fun handleResult(result: Result) = when (result) {
    is Success -> println("Success: ${result.data}")
    is Error -> println("Error: ${result.message}")
}

fun main() {
    handleResult(Success("Data loaded"))
    handleResult(Error("Something went wrong"))
}
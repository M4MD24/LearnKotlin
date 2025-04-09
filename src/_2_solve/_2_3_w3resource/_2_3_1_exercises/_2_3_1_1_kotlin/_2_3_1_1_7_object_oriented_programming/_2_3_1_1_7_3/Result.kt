package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_3

sealed class Result<out T> {
    data class Success<T>(val data: T) : Result<T>()
    data class Error(val errorMessage: String) : Result<Nothing>()
}

fun handleResult(result: Result<Int>) {
    when (result) {
        is Result.Success -> println("Success: Result is ${result.data}")
        is Result.Error -> println("Error: ${result.errorMessage}")
    }
}
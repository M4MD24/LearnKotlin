package _1_learn._1_2_handling._1_2_1_exception_handling._1_2_1_4_assertion

fun main() {
    val age = 14
    assert(age <= 18) {
        "Age must be 18 or older" // Checking the assumption using assert
    }
    println("Assertion passed successfully, age is valid")
}
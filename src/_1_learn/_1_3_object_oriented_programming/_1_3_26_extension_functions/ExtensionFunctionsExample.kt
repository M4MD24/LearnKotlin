package _1_learn._1_3_object_oriented_programming._1_3_26_extension_functions

fun main() {
    print("Hello World".isHelloWorld())
}

fun String.isHelloWorld() = this == "Hello World"
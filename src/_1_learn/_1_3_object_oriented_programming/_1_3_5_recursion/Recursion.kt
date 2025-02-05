package _1_learn._1_3_object_oriented_programming._1_3_5_recursion

var index: Int = 0

fun main() {
    methodExample()
}

fun methodExample() {
    println("${index++} Start")
    if (index != 5)
        methodExample() /* Recursion */
    else
        println("$index Stop")
}
package _1_learn._1_3_object_oriented_programming._1_3_29_data_object_and_singleton

private data object Singleton {
    const val MESSAGE = "Hello, Kotlin!"
}

fun main() {
    println(Singleton.MESSAGE)
    print(Singleton)
}
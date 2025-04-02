package _1_learn._1_3_object_oriented_programming._1_3_21_keywords._1_3_21_2_internal

// File: MyClass.kt (within the same module)
internal class MyClass {
    internal fun greet() = "Hello from MyClass"
}

// File: Main.kt (within the same module)
fun main() {
    val `object` = MyClass()  // Allowed since it's in the same module
    println(`object`.greet()) // Allowed
}
package _1_learn._1_3_object_oriented_programming._1_3_17_nested_class

fun main() {
    val nested = Outer.Nested() // No need for an Outer instance
    print(nested.show()) // Output: Hello from Nested Class
}
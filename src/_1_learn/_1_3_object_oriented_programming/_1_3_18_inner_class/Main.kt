package _1_learn._1_3_object_oriented_programming._1_3_18_inner_class

fun main() {
    val outer = Outer()
    val inner = outer.Inner() // Requires an instance of Outer
    print(inner.show()) // Output: Hello from Outer Class
}
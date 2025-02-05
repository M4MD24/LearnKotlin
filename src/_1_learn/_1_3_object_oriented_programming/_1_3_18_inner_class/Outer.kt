package _1_learn._1_3_object_oriented_programming._1_3_18_inner_class

class Outer {
    private val MESSAGE = "Hello from Outer Class"

    inner class Inner {
        fun show() = MESSAGE // Can access outer class members
    }
}
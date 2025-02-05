package _1_learn._1_3_object_oriented_programming._1_3_7_inheritance._1_3_7_1_inheritance_with_class_and_function

open class Apple : Fruit() {
    // Apple Inherit Fruit
    fun displayName() {
        println("Name: $name")
    }
}
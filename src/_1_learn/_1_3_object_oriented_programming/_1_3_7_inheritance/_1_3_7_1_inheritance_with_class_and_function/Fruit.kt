package _1_learn._1_3_object_oriented_programming._1_3_7_inheritance._1_3_7_1_inheritance_with_class_and_function

open class Fruit {
    var name: String? = null
    var color: String? = null

    fun displayColor() { // Package Private
        println("Color: $color")
    }

    open fun displayOrigin(origin: String) {
        print("Origin: $origin")
    }
}
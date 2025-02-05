package _1_learn._1_3_object_oriented_programming._1_3_9_polymorphism

/* Method overloading is also an example of polymorphism! */ /* The print() method is also an example of polymorphism, Because used to print values of different types like char, int, string, etc! */

// Polymorphism
open class Shape {
    open fun render() {
        println("Shape")
    }
}

class Square : Shape() {
    override fun render() {
        println("Square")
    }
}

class Circle : Shape() {
    override fun render() {
        println("Circle")
    }
}

fun main() {
    // Polymorphism
    val SHAPE = Shape()
    SHAPE.render()
    val SQUARE: Shape = Square()
    SQUARE.render()
    val CIRCLE: Shape = Circle()
    CIRCLE.render()

    // Polymorphism with Overloading Method
    method('a')
    method("Aa")
}

fun method(charVariable: Char) {
    println(charVariable)
}

fun method(stringVariable: String) {
    println(stringVariable)
}
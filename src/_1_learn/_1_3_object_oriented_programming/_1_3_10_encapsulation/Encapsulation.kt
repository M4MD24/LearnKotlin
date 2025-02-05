package _1_learn._1_3_object_oriented_programming._1_3_10_encapsulation

class Rectangle {
    private var width: Float = 0F
    private var length: Float = 0F

    fun getWidth(): Float {
        return width
    }

    fun getLength(): Float {
        return length
    }

    fun setWidth(width: Float) {
        this.width = width
    }

    fun setLength(length: Float) {
        this.length = length
    }

    fun displayCalculateRectangleArea() {
        val result = width * length
        print("Rectangle Area: $result")
    }
}

fun main() {
    val RECTANGLE = Rectangle()
    RECTANGLE.setWidth(2F)
    RECTANGLE.setLength(10F)
    println("width = " + RECTANGLE.getWidth())
    println("length = " + RECTANGLE.getLength())
    RECTANGLE.displayCalculateRectangleArea()
}
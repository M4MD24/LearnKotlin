package _1_learn._1_3_object_oriented_programming._1_3_15_enum_constructor

fun main() {
    println("Fruits.APPLE: " + Fruits.APPLE)
    println("Fruits.APPLE.toString(): " + Fruits.APPLE.toString())
    println("Fruits.APPLE.getFruit(): " + Fruits.APPLE.fruitText)

    /* Error ! */
    /*
    print("Fruits.BANANA.getFruit(): " + Fruits.APPLE.getFruit());
    */
}
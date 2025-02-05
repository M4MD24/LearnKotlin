package _1_learn._1_3_object_oriented_programming._1_3_22_generic_class

/**
 * @param data variable of T type
 */
class GenericClass<T>(val data: T) {
    fun <B> genericsMethod(data: B) {
        println("Generic Method without Extend Number: $data")
    }
}

class GenericClassWithExtends<T : Number?> {
    fun display(t: T) {
        println("Generic Method with Extend Number   : $t")
    }
}

fun main() {
    // initialize generic class
    // with Integer data
    val intObj = GenericClass(5)
    println("Generic Class returns: " + intObj.data)

    // initialize generic class
    // with String data
    val stringObj = GenericClass("Generic Class")
    println("Generic Class returns: " + stringObj.data)

    val genericsMethods = GenericClass(5.6)
    genericsMethods.genericsMethod(99.9)

    val obj = GenericClassWithExtends<Int>()
    obj.display(1)
}
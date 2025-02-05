package _1_learn._1_3_object_oriented_programming._1_3_6_is

fun main() {
    val name = "Mohamed"
    val instanceOfString = name is String
    println("name is an instance of String: $instanceOfString")

    val objectVariable = ClassExample()
    val instanceOfObject = objectVariable is ClassExample
    print("object is an instance of InstanceOf: $instanceOfObject")
}
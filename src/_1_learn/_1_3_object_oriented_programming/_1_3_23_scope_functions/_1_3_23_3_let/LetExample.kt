package _1_learn._1_3_object_oriented_programming._1_3_23_scope_functions._1_3_23_3_let

fun main() {
    val nullName: String? = null
    nullName?.let {
        println(nullName.length)
    }

    val name = "Mohamed"
    val resultOfName = name.let {
        println(it.length)
        "Done"
    }
    print(resultOfName)
}
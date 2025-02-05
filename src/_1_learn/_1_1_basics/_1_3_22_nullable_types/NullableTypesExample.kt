package _1_learn._1_1_basics._1_3_22_nullable_types

fun main() {
//    Nullable Type
    val name: String? = null

    print(
//    Safe call
        name?.length
            ?: -1 // Elvis Operator
    )

    print(
//    Non-null assertion Operator
        name!!.length
    )
}
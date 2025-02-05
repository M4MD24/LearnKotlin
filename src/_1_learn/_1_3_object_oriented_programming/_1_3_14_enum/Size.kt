package _1_learn._1_3_object_oriented_programming._1_3_14_enum

enum class Size {
    /* The enum constants are usually represented in uppercase! */
    SMALL,
    MEDIUM,
    LARGE;

    val size: String
        get() = when (this) {
            SMALL -> "Small Size"
            MEDIUM -> "MEDIUM Size"
            LARGE -> "LARGE Size"
        }
}
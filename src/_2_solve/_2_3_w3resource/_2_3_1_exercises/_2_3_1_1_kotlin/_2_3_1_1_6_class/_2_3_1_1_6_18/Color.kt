package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_18

enum class Color(private val colorName: String) {
    LIME_GREEN("Lime Green"),
    CRIMSON("Crimson"),
    GOLD("Gold"),
    DEEP_SKY_BLUE("Deep Sky Blue"),
    DEEP_PINK("Deep Pink"),
    GRAY("Gray"),
    PURPLE("Purple"),
    BLACK("Black"),
    RED("Red");

    override fun toString(): String = colorName
}
package _1_learn._1_3_object_oriented_programming._1_3_15_enum_constructor

// Private enum constructor
enum class Fruits(val fruitText: String) {
    // enum constants calling the enum constructors
    APPLE("The fruit is apple") {
        override fun toString(): String { // overriding toString() for APPLE
            return "Apple"
        }
    },
    MANGO("The fruit is mango") {
        fun displayMango(): String {
            return "Mango"
        }
    },
    BANANA("The fruit is banana")
}
package _1_learn._1_1_basics._1_1_17_string_builder

fun main() {
    val ONE = StringBuilder("One")
    val TWO = StringBuilder("Two")
    val THREE = StringBuilder("Three")
    val COMMA = StringBuilder(", ")

    ONE.append(COMMA)
        .append(THREE)
    println(".append() after        : $ONE")

    ONE.insert(3, COMMA)
        .insert(5, TWO)
    println(".insert() after        : $ONE")

    ONE.setLength(8)
    println(".setLength() after     : $ONE")

    println(".capacity()            : " + ONE.capacity())

    ONE.ensureCapacity(100)
    println(".ensureCapacity() after: " + ONE.capacity())

    print(".reverse()             : " + ONE.reverse())
}
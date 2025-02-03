package _1_learn._1_1_basics._1_1_16_string_buffer

fun main() {
    val ONE = StringBuffer("One")
    val TWO = StringBuffer("Two")
    val THREE = StringBuffer("Three")
    val COMMA = StringBuffer(", ")

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
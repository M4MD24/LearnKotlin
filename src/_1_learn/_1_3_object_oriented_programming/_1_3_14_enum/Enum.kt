package _1_learn._1_3_object_oriented_programming._1_3_14_enum

fun main() {
    // getSize
    println("getSize: " + Size.SMALL.size)

    // ordinal() Method
    val smallOrdinal = Size.SMALL.ordinal
    println("Ordinal of SMALL: $smallOrdinal")

    // compareTo() Method
    val comparisonResult = Size.SMALL.compareTo(Size.MEDIUM)
    println("Comparison result between SMALL and MEDIUM: $comparisonResult")

    // toString() Method
    val smallToString = Size.SMALL.toString()
    println("String representation of SMALL: $smallToString")

    // name() Method
    val smallName = Size.SMALL.name
    println("Name of SMALL: $smallName")

    // valueOf() Method
    val mediumEnum = Size.valueOf("MEDIUM")
    println("SortingStatus constant for MEDIUM: $mediumEnum")

    // values() Method
    val enumArray = Size.entries.toTypedArray()
    println("SortingStatus constants in Size enum:")
    for (size in enumArray) {
        println("" + size)
    }
}
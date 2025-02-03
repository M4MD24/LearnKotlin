package _1_learn._1_1_basics._1_1_8_arrays._1_1_8_1_array

fun main() {
//        1D Dimensional Array
    val byteArrayVariable = byteArrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90)
    println("byte Array Variable = " + byteArrayVariable[0])
    val byteArrayVariable2 = byteArrayOf('a'.code.toByte(), 'b'.code.toByte(), 'c'.code.toByte(), 'd'.code.toByte(), 'e'.code.toByte(), 'f'.code.toByte(), 'g'.code.toByte(), 'h'.code.toByte(), 'i'.code.toByte(), 'j'.code.toByte(), 'k'.code.toByte(), 'l'.code.toByte(), 'm'.code.toByte(), 'n'.code.toByte(), 'o'.code.toByte(), 'p'.code.toByte(), 'q'.code.toByte(), 'r'.code.toByte(), 's'.code.toByte(), 't'.code.toByte(), 'u'.code.toByte(), 'v'.code.toByte(), 'w'.code.toByte(), 'x'.code.toByte(), 'y'.code.toByte(), 'z'.code.toByte())
    println("byte Array Variable 2 = " + byteArrayVariable2[0])

    val shortArrayVariable = shortArrayOf(1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000)
    println("short Array Variable = " + shortArrayVariable[0])
    val shortArrayVariable2 = shortArrayOf('a'.code.toShort(), 'b'.code.toShort(), 'c'.code.toShort(), 'd'.code.toShort(), 'e'.code.toShort(), 'f'.code.toShort(), 'g'.code.toShort(), 'h'.code.toShort(), 'i'.code.toShort(), 'j'.code.toShort(), 'k'.code.toShort(), 'l'.code.toShort(), 'm'.code.toShort(), 'n'.code.toShort(), 'o'.code.toShort(), 'p'.code.toShort(), 'q'.code.toShort(), 'r'.code.toShort(), 's'.code.toShort(), 't'.code.toShort(), 'u'.code.toShort(), 'v'.code.toShort(), 'w'.code.toShort(), 'x'.code.toShort(), 'y'.code.toShort(), 'z'.code.toShort())
    println("short Array Variable 2 = " + shortArrayVariable2[0])

    val intArrayVariable = intArrayOf(10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000)
    println("int Array Variable = " + intArrayVariable[0])
    val intArrayVariable2 = intArrayOf('a'.code, 'b'.code, 'c'.code, 'd'.code, 'e'.code, 'f'.code, 'g'.code, 'h'.code, 'i'.code, 'j'.code, 'k'.code, 'l'.code, 'm'.code, 'n'.code, 'o'.code, 'p'.code, 'q'.code, 'r'.code, 's'.code, 't'.code, 'u'.code, 'v'.code, 'w'.code, 'x'.code, 'y'.code, 'z'.code)
    println("int Array Variable 2 = " + intArrayVariable2[0])

    val longArrayVariable = longArrayOf(100000000, 200000000, 300000000, 400000000, 500000000, 600000000, 700000000, 800000000, 900000000)
    println("long Array Variable = " + longArrayVariable[0])
    val longArrayVariable2 = longArrayOf('a'.code.toLong(), 'b'.code.toLong(), 'c'.code.toLong(), 'd'.code.toLong(), 'e'.code.toLong(), 'f'.code.toLong(), 'g'.code.toLong(), 'h'.code.toLong(), 'i'.code.toLong(), 'j'.code.toLong(), 'k'.code.toLong(), 'l'.code.toLong(), 'm'.code.toLong(), 'n'.code.toLong(), 'o'.code.toLong(), 'p'.code.toLong(), 'q'.code.toLong(), 'r'.code.toLong(), 's'.code.toLong(), 't'.code.toLong(), 'u'.code.toLong(), 'v'.code.toLong(), 'w'.code.toLong(), 'x'.code.toLong(), 'y'.code.toLong(), 'z'.code.toLong())
    println("long Array Variable 2 = " + longArrayVariable2[0])

    val booleanArrayVariable = booleanArrayOf(true, false)
    println("boolean Array Variable = " + booleanArrayVariable[0])

    val charArrayVariable = charArrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
    println("char Array Variable = " + charArrayVariable[0])
    val charArrayVariable2 = charArrayOf(1000.toChar(), 2000.toChar(), 3000.toChar(), 4000.toChar(), 5000.toChar(), 6000.toChar(), 7000.toChar(), 8000.toChar(), 9000.toChar())
    println("char Array Variable 2 = " + charArrayVariable2[0])

    val stringArrayVariable = arrayOf("Aa", "Bb", "Cc", "Dd", "Ee", "Ff", "Gg", "Hh", "Ii", "Jj", "Kk", "Ll", "Mm", "Nn", "Oo", "Pp", "Qq", "Rr", "Ss", "Tt", "Uu", "Vv", "Ww", "Xx", "Yy", "Zz")
    println("string Array Variable = " + stringArrayVariable[0])

    println()

    // Edit Array:
    val array = intArrayOf(45, 32, 68)
    println("Before Edit: " + array[0])
    array[0] = 5
    println("After Edit: " + array[0])
}
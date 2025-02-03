package _1_learn._1_1_basics._1_1_8_arrays._1_1_8_2_multidimensional_array

fun main() {
    /* You can create endless arrays! */

    println("3D Dimensional")
    val array3D = arrayOf(
        arrayOf(
            byteArrayOf(10, 20, 30, 40, 50),
            byteArrayOf(10, 20, 30, 40, 50),
            byteArrayOf(10, 20, 30, 40, 50),
            byteArrayOf(10, 20, 30, 40, 50)
        ),
        arrayOf(
            byteArrayOf(10, 20, 30, 40, 50),
            byteArrayOf(10, 20, 30, 40, 50),
            byteArrayOf(10, 20, 30, 40, 50),
            byteArrayOf(10, 20, 30, 40, 50)
        ),
        arrayOf(
            byteArrayOf(10, 20, 30, 40, 50),
            byteArrayOf(10, 20, 30, 40, 50),
            byteArrayOf(10, 20, 30, 40, 50),
            byteArrayOf(10, 20, 30, 40, 50)
        )
    )

    for (array2D in array3D) {
        for (array1D in array2D) {
            for (item in array1D) {
                print("$item ")
            }
            println()
        }
        println()
    }

    println()

    println("2D Dimensional")
    val array2D = arrayOf(
        byteArrayOf(10, 20, 30, 40, 50),
        byteArrayOf(10, 20, 30, 40, 50),
        byteArrayOf(10, 20, 30, 40, 50),
        byteArrayOf(10, 20, 30, 40, 50)
    )

    for (array1D in array2D) {
        for (item in array1D) {
            print("$item ")
        }
        println()
    }
}
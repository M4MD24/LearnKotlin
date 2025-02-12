package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_35_array_root

fun main() {
    println(arrayRoot(mutableListOf(4.0, 81.0, 49.0)))
    println(arrayRoot(mutableListOf(15.0, 6.0, 3.0)))
    println(arrayRoot(mutableListOf(121.0, 144.0, 169.0)))
    print(arrayRoot(mutableListOf(4.2, 6.9)))
}

private fun arrayRoot(numbers: MutableList<Double>): MutableList<Double> {
    val rootOfNumbers = mutableListOf<Double>()
    for (number in numbers)
        rootOfNumbers.add(Math.sqrt(number))
    return rootOfNumbers
}
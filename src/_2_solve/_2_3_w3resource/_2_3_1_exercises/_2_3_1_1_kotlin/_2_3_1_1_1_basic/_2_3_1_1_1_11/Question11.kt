package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_1_basic._2_3_1_1_1_11

/**
 * Write a Kotlin program to convert temperature from Celsius to Fahrenheit and vice versa.
 * */

fun main() {
    print("Enter Temperature: ")
    val temperature = readln().toDouble()
    print(
        """
        1. Convert Celsius to Fahrenheit
        2. Convert Fahrenheit to Celsius
        Choose Option: """.trimIndent()
    )
    val currentOption = readln().toByte()
    val convertedTemperature = when (currentOption) {
        1.toByte() -> convertCelsiusToFahrenheit(temperature)
        2.toByte() -> convertFahrenheitToCelsius(temperature)
        else -> throw IllegalStateException("Invalid Option Selected!")
    }
    print("Temperature After Convert: $convertedTemperature")
}

private fun convertCelsiusToFahrenheit(temperature: Double) = temperature * 9 / 5 + 32

private fun convertFahrenheitToCelsius(temperature: Double) = (temperature - 32) * 5 / 9
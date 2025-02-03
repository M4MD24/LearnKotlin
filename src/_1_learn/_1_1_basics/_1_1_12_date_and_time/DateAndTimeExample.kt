package _1_learn._1_1_basics._1_1_12_date_and_time

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.*

/**
 *
 *  * **LocalDate** - Represents a date (year, month, day (yyyy-MM-dd))
 *  * **LocalTime** - Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
 *  * **LocalDateTime** - Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
 *  * **DateTimeFormatter** - Formatter for displaying and parsing date-time objects
 *
 */
fun main() {
    date()
    time()
    dateAndTime()
    formattingDateAndTime()
    sampleDateFormat()
}

private fun date() {
    println("■ Date:")
    val DATE_NOW = LocalDate.now()
    println("Date Now        : $DATE_NOW")
    println("Year            : " + DATE_NOW.year)
    println("Month           : " + DATE_NOW.month)
    println("DayOfYear       : " + DATE_NOW.dayOfYear)
    println("DayOfMonth      : " + DATE_NOW.dayOfMonth)
    println("DayOfWeek       : " + DATE_NOW.dayOfWeek + "\n")
}

private fun time() {
    println("■ Time:")
    val TIME_NOW = LocalTime.now()
    println("Time Now        : $TIME_NOW")
    println("Hours           : " + TIME_NOW.hour)
    println("Minutes         : " + TIME_NOW.minute)
    println("Seconds         : " + TIME_NOW.second)
    println("Nano of Seconds : " + TIME_NOW.nano + "\n")
}

private fun dateAndTime() {
    println("■ Date and Time:")
    val DATE_AND_TIME_NOW = LocalDateTime.now()
    println("Date and Time Now: $DATE_AND_TIME_NOW")

    println("Date Now         : " + DATE_AND_TIME_NOW.year)
    println("Year             : " + DATE_AND_TIME_NOW.year)
    println("Month            : " + DATE_AND_TIME_NOW.month)
    println("DayOfYear        : " + DATE_AND_TIME_NOW.dayOfYear)
    println("DayOfMonth       : " + DATE_AND_TIME_NOW.dayOfMonth)
    println("DayOfWeek        : " + DATE_AND_TIME_NOW.dayOfWeek)

    println("Time Now         : $DATE_AND_TIME_NOW")
    println("Hours            : " + DATE_AND_TIME_NOW.hour)
    println("Minutes          : " + DATE_AND_TIME_NOW.minute)
    println("Seconds          : " + DATE_AND_TIME_NOW.second)
    println("Nano of Seconds  : " + DATE_AND_TIME_NOW.nano + "\n")
}

private fun formattingDateAndTime() {
    println("■ Formatting Date and Time:")
    val DATE_AND_TIME_NOW = LocalDateTime.now()

    println("Before Formatting: $DATE_AND_TIME_NOW")

    val FORMATTING_DATE_AND_TIME = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
    val FORMATTED_DATE_AND_TIME = DATE_AND_TIME_NOW.format(FORMATTING_DATE_AND_TIME)
    println("After Formatting: $FORMATTED_DATE_AND_TIME\n")
}

private fun sampleDateFormat() {
    println("■ Simple Date Format:")
    val SIMPLE_DATE_FORMAT = SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS")
    SIMPLE_DATE_FORMAT.calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+2"))
    print(SIMPLE_DATE_FORMAT.format(System.currentTimeMillis()))
}
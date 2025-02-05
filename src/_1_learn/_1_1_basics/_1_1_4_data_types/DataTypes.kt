package _1_learn._1_1_basics._1_1_4_data_types

import java.util.Locale

fun main() {
    val BYTE_VALUE: Byte = 24
    val SHORT_VALUE: Short = 1424
    val INTEGER_VALUE: Int = 1424
    val LONG_VALUE: Long = 1424
    val FLOAT_VALUE: Float = 14.24F
    val DOUBLE_VALUE: Double = 14.24
    val CHARACTER_VALUE: Char = 'M'
    val BOOLEAN_VALUE: Boolean = true
    val STRING_VALUE: String = "Mohamed"
    val ANY_VALUE: Any = "Any thing"
    val NOTHING_VALUE: Nothing? = null /*? = nullable type!*/
    val UNIT_VALUE: Unit = Unit

//    String
    val stringVariable = "AA aa"
    println("\nstringVariable                : $stringVariable")

    /* ■ String Methods
    |-------------------------|-------------------------------------------------------------------------|
    |  Method                 |  Description                                                            |
    |-------------------------|-------------------------------------------------------------------------|
    |  contains()             |  checks whether the string contains a substring                         |
    |  substring()            |  returns the substring of the string                                    |
    |  join()                 |  join the given strings using the delimiter                             |
    |  replace()              |  replaces the specified old character with the specified new character  |
    |  replaceAll()           |  replaces all substrings matching the regex pattern                     |
    |  replaceFirst()         |  replace the first matching substring                                   |
    |  charAt()               |  returns the character present in the specified location                |
    |  getBytes()             |  converts the string to an array of bytes                               |
    |  indexOf()              |  returns the position of the specified character in the string          |
    |  compareTo()            |  compares two strings in the dictionary order                           |
    |  compareToIgnoreCase()  |  compares two strings ignoring case differences                         |
    |  trim()                 |  removes any leading and trailing whitespaces                           |
    |  formatted()            |  returns a formatted string                                             |
    |  split()                |  breaks the string into an array of strings                             |
    |  toLowerCase()          |  converts the string to lowercase                                       |
    |  toUpperCase()          |  converts the string to uppercase                                       |
    |  toCharArray()          |  converts the string to a char array                                    |
    |  matches()              |  checks whether the string matches the given regex                      |
    |  startsWith()           |  checks if the string begins with the given string                      |
    |  endsWith()             |  checks if the string ends with the given string                        |
    |  isEmpty()              |  checks whether a string is empty of not                                |
    |  intern()               |  returns the canonical representation of the string                     |
    |  contentEquals()        |  checks whether the string is equal to charSequence                     |
    |  hashCode()             |  returns a hash code for the string                                     |
    |  subSequence()          |  returns a subsequence from the string                                  |
    |-------------------------|-------------------------------------------------------------------------|
    */
    println("(" + stringVariable + ") .contains()           : " + stringVariable.contains("a"))
    println("(" + stringVariable + ") .subString()          : " + stringVariable.substring(1))
    println("(" + stringVariable + ") .replace()            : " + stringVariable.replace("a", "A"))
    println("(" + stringVariable + ") .replaceAll()         : " + stringVariable.replace("A".toRegex(), "a"))
    println("(" + stringVariable + ") .replaceFirst()       : " + stringVariable.replaceFirst("a".toRegex(), "A"))
    println("(" + stringVariable + ") .charAt()             : " + stringVariable[1])
    println("(" + stringVariable + ") .getBytes()           : " + stringVariable.toByteArray().contentToString())
    println("(" + stringVariable + ") .indexOf()            : " + stringVariable.indexOf("a"))
    println("(" + stringVariable + ") .compareTo()          : " + stringVariable.compareTo("a"))
    println("(" + stringVariable + ") .compareToIgnoreCase(): " + stringVariable.compareTo("aa", ignoreCase = true))
    println("(" + stringVariable + ") .trim()               : " + stringVariable.trim { it <= ' ' })
    println("(" + stringVariable + ") .split()              : " + stringVariable.split("A".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray().contentToString())
    println("(" + stringVariable + ") .toLowerCase()        : " + stringVariable.lowercase(Locale.getDefault()))
    println("(" + stringVariable + ") .toUpperCase()        : " + stringVariable.uppercase(Locale.getDefault()))
    println("(" + stringVariable + ") .toCharArray()        : " + stringVariable.toCharArray().contentToString())
    println("(" + stringVariable + ") .matches()            : " + stringVariable.matches("AA aa".toRegex()))
    println("(" + stringVariable + ") .startsWith()         : " + stringVariable.startsWith("AA"))
    println("(" + stringVariable + ") .endsWith()           : " + stringVariable.endsWith("aa"))
    println("(" + stringVariable + ") .isEmpty()            : " + stringVariable.isEmpty())
    println("(" + stringVariable + ") .intern()             : " + stringVariable.intern())
    println("(" + stringVariable + ") .contentEquals()      : " + stringVariable.contentEquals("AA aa"))
    println("(" + stringVariable + ") .hashCode()           : " + stringVariable.hashCode())
    println("(" + stringVariable + ") .subSequence()        : " + stringVariable.subSequence(1, 4))
    println("(" + stringVariable + ") .concat()             : " + (stringVariable + "Aa"))
}
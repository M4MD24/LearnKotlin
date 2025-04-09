package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_4

import _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_4.formatting.BoldDecorator
import _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_4.formatting.ItalicDecorator

/**
 * Write a Kotlin object-oriented program that implements the decorator pattern by creating a base class Component and decorator classes BoldDecorator and ItalicDecorator to modify the behavior of the component.
 * */

fun main() {
    val text = Text("Hello Developer!")

    val boldText = BoldDecorator(text)
    val italicText = ItalicDecorator(text)
    val boldItalicText = BoldDecorator(ItalicDecorator(text))

    println("Text: ${text.render()}")
    println("Bold: ${boldText.render()}")
    println("Italic: ${italicText.render()}")
    println("Bold and Italic: ${boldItalicText.render()}")
}
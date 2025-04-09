package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_4.formatting

import _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_4.TextService

class BoldDecorator(component: TextService) : TextDecorator(component) {
    override fun render(): String = "<b>${super.render()}</b>"
}
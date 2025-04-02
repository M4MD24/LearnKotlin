package _1_learn._1_3_object_oriented_programming._1_3_21_keywords._1_3_21_3_sealed._1_3_21_3_2_interface

sealed interface Animal {
    fun makeSound()
}

data object Dog : Animal {
    override fun makeSound() = println("Woof!")
}

data object Cat : Animal {
    override fun makeSound() = println("Meow!")
}

fun main() {
    val animals: List<Animal> = listOf(Dog, Cat)
    for (animal in animals)
        animal.makeSound()
}
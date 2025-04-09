package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_6

/**
 * Write a Kotlin object-oriented program that creates an interface Observable with methods subscribe and unsubscribe. Implement it in a class Publisher to allow objects to subscribe and unsubscribe from events.
 * */

fun main() {
    val publisher = Publisher()

    val smsNotification = ConcreteObserver("SMS")
    val emailNotification = ConcreteObserver("Email")

    publisher.subscribe(smsNotification)
    publisher.subscribe(emailNotification)
    publisher.setMessage("Hello Developer!")
    publisher.notifyObservers()

    publisher.unSubscribe(smsNotification)
    publisher.setMessage("Hello Kotlin!")
    publisher.notifyObservers()
}
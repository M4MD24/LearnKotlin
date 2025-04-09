package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_6

interface Observable {
    fun subscribe(observerService: ObserverService)
    fun unSubscribe(observerService: ObserverService)
    fun setMessage(message: String)
    fun notifyObservers()
}
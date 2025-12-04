package coroutine

import java.util.Date

fun main() {
    val runnable = Runnable {
     println(Date())
        Thread.sleep(2_000)
        println("hello")
    }

    val runnable1 = Runnable {
        println(Date())
        Thread.sleep(2_000)
        println("hello runnable 1")
    }

    val thread0 = Thread(runnable)
    val thread1 = Thread(runnable1)

    thread0.start()
    thread1.start()

    println("Program Selesai")
}
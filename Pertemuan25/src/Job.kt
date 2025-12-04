package coroutine

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    println("Aplikasi dimulai")

    val job : Job = launch {
        updateVersion1()
    }

    println("Apakah Job ini selesa? ${job.isCompleted}")
    println("Apakah Job ini aktif? ${job.isActive}")
    println("Apakah Job ini dibatalkan? ${job.isCancelled}")
}

suspend fun updateVersion1(){
    delay(5_000)
    println("Update selesai.")
}
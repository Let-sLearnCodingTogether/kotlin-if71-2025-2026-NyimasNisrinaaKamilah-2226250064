package coroutine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{

    launch (Dispatchers.IO) {
        println("Dispatohers.IO")
    }

    launch (Dispatchers.Default) {
        println("Dispatohers.Default")
    }
}

suspend fun updateVersion3(){
    delay(5_000)
    println("Update selesai.")
}
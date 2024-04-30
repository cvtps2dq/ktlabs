package lab7

import kotlinx.coroutines.*
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    // launch coroutine
    GlobalScope.launch {
        while (true) {
            // get time
            val currentTime = getCurrentTime()
            println("Текущее время: $currentTime")

            // waiting 1000ms
            delay(1000)
        }
    }

    // sleep for app activity - prevent exiting
    Thread.sleep(Long.MAX_VALUE)
}

// time func
fun getCurrentTime(): String {
    val sdf = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
    return sdf.format(Date())
}
import kotlinx.coroutines.*

suspend fun <T> withTimeoutOneSecond(block: suspend () -> T): T? {
    return withTimeoutOrNull(1000) {
        block()
    }
}

suspend fun longRunningTask(): String {
    delay(2000) // имитация длительной операции
    return "Task completed"
}

suspend fun main() {
    val result1 = withTimeoutOneSecond {
        longRunningTask()
    }
    println(result1 ?: "Too long body execution")

    val result2 = withTimeoutOneSecond {
        delay(500) // имитация короткой операции
        "Task completed"
    }
    println(result2 ?: "Too long body execution")
}
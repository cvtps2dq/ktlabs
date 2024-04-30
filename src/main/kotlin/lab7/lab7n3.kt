package lab7

import kotlinx.coroutines.*
import java.util.concurrent.ConcurrentHashMap
import kotlin.random.Random
import kotlin.system.measureTimeMillis

suspend fun simpleTask(index: Int): Pair<Int, Boolean> {
    val randomNumber = Random.nextInt(1000)
    return Pair(index, randomNumber % 2 == 0)
}

fun main() = runBlocking {
    val resultMap = ConcurrentHashMap<Int, Boolean>()

    val time = measureTimeMillis {
        val jobs = List(100_000) { index ->
            // Запуск корутины и сохранение ее Deferred
            async {
                simpleTask(index).also { result ->
                    // Сохранение результата в Map
                    resultMap[result.first] = result.second
                }
            }
        }
        // Дождаться завершения всех корутин
        jobs.awaitAll()
    }

    // Подсчет успешно выполненных задач
    val successfulTasks = resultMap.count { it.value }

    println("Количество успешно выполненных задач: $successfulTasks")
    println("Общее время выполнения всех корутин: $time мс")
}
package lab7

import kotlinx.coroutines.*
import kotlin.math.*

suspend fun complexMathOperation(a: Double, b: Double): Double {
    return a * log10(a + b) + sqrt(a * b) / a.pow(b) + tan(a * b) * sin(a * log(b + a, a))
}

fun main() = runBlocking {
    println("enter two values separated by space: ")
    val input = readLine()?.split(" ") ?: return@runBlocking
    val a = input.getOrNull(0)?.toDoubleOrNull() ?: return@runBlocking
    val b = input.getOrNull(1)?.toDoubleOrNull() ?: return@runBlocking

    val result = complexMathOperation(a, b)
    println("result: $result")
}
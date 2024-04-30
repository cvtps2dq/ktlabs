package lab6

fun applyFunction(number: Int, function: (Int) -> Int): Int {
    return function(number)
}

fun createMultiplier(multiplier: Int): (Int) -> Int {
    return { number -> number * multiplier }
}

fun main() {
    val result1 = applyFunction(20) { it * 2 } // multiply by 2 - should be 20 * 2 = 40
    println("result: $result1")

    val multiplierBy4 = createMultiplier(4) // create a func, that multiples x times n
    val result2 = multiplierBy4(5) // pass x into a func - should be 4 * 5 = 20
    println("result: $result2")
}
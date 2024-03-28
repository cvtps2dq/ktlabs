package lab5

fun task(initialPrice: Double, discountPercent: Double): Double {
    val discountAmount = initialPrice * discountPercent / 100
    val finalPrice = initialPrice - discountAmount
    return finalPrice.round()
}

fun Double.round(): Double {
    return "%.${2}f".format(this).toDouble()
}

fun main() {
    val initialPrice = 100.0
    val discountPercent = 20.0
    val finalPrice = task(initialPrice, discountPercent)
    println("start: \$${initialPrice}")
    println("discount: ${discountPercent}%")
    println("final: \$${finalPrice}")
}
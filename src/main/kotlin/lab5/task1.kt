package lab5

fun task(number: Int): String{
    return if (number < 1000 || number > 9999) {
        number.toString()
    } else {
        val roundedNumber = (number / 1000)
        "$roundedNumber" + "К"
    }
}

fun main(){
    val number = 1272
    print(task(number))
}
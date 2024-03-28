package lab5

fun task(sentence: String): Int {
    val words = sentence.split(Regex("\\s+|,|\\."))
    return words.count { it.isNotBlank() }
}

fun main() {
    val sentence1 = "this is an example."
    val sentence2 = "  this   is an example too, but  it    contains spaces  ,  and   splitters !"
    val sentence3 = "А это - вариант с точкой; в конце!"

    println("count in 1: ${task(sentence1)}")
    println("count in 2: ${task(sentence2)}")
    println("count in 3: ${task(sentence3)}")
}
package lab4

import kotlin.random.Random

fun <T : Comparable<T>> insertionSort(array: ArrayList<T>) {
    val n = array.size
    for (i in 1 until n) {
        val key = array[i]
        var j = i - 1
        while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j]
            j--
        }
        array[j + 1] = key
    }
}

fun task1(){
    val number1 = Random.nextInt(100)
    val number2 = Random.nextInt(100)

    val maxNumber = if (number1 > number2) number1 else number2
    val minNumber = if (number1 < number2) number1 else number2

    println("first: $number1")
    println("second: $number2")
    println("max of two: $maxNumber")

    val array = IntRange(minNumber, maxNumber).toList().toIntArray()
    println("array: ${array.joinToString(", ")}")
}
fun task2(){
    val arr = ArrayList<Int>();
    arr.add(8); arr.add(21); arr.add(5); arr.add(90)
    arr.add(11); arr.add(0)

    arr.removeAt(4)
    arr.add(-35)

    println("array: ${arr.joinToString(", ")}")

}
fun task3(){
    println("enter array. 'STOP' to end")
    val arr = ArrayList<Int>();
    while(true){
        val data = readlnOrNull()
        if (data == "STOP") break
        else{
            if (data != null) {
                data.toIntOrNull()?.let { arr.add(it) }
            }
        }
    }
    println("max val: ${arr.max()}, min val: ${arr.min()}")
}

fun task4(){
    println("enter array. 'STOP' to end")
    val arr = ArrayList<Int>();
    while(true){
        val data = readlnOrNull()
        if (data == "STOP") break
        else{
            if (data != null) {
                data.toIntOrNull()?.let { arr.add(it) }
            }
        }
    }
    arr.remove(arr.min())
    println("second min val: ${arr.min()}")
}

fun task5(){
    println("enter array. 'STOP' to end")
    val arr = ArrayList<Int>();
    while(true){
        val data = readlnOrNull()
        if (data == "STOP") break
        else{
            if (data != null) {
                data.toIntOrNull()?.let { arr.add(it) }
            }
        }
    }
    println("kotlin's sort")
    println(arr.joinToString(", "))
    println("implemented insertion sort")
    println(arr.joinToString(", "))
}

fun task6(){
    var sum = 0
    println("enter array. 'STOP' to end")
    val arr = ArrayList<Int>();
    while(true){
        val data = readlnOrNull()
        if (data == "STOP") break
        else{
            if (data != null) {
                data.toIntOrNull()?.let { arr.add(it) }
            }
        }
    }
    for (x in arr){
        sum += x;
    }
    val med = sum / arr.size
    println(arr.drop(med).joinToString(", "))
}

fun main(){
    //task1()
    //task2()
    //task3()
    //task4()
    task5()
}
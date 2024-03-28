package org.example

import kotlin.math.sqrt
import kotlin.random.Random

fun task1(){
    for(i in 1..5){
        println(i.toString().repeat(i))
    }
}

fun task2(){
    val num = (0..9).random()
    println("guess.")

    while(true){
        print("lemme guess: ")
        var guess = readlnOrNull()?.toIntOrNull()
        if (guess in 1..9) {
            if (guess == num) {
                println("ok you won")
                break
            }
            else println("nah man u missed")
        } else println("D I G I T S!!!! not numbers silly")
    }
}
fun task3(){
    println("give me a number:")
    val number = readlnOrNull()?.toIntOrNull()

    if (number != null) {
        val divisors = mutableListOf<Int>()
        for (i in 1..sqrt(number.toDouble()).toInt()) {
            if (number % i == 0) {
                divisors.add(i)
                if (i != number / i) {
                    divisors.add(number / i)
                }
            }
        }
        divisors.sort()
        println("here")
        println(divisors.joinToString(", "))
    } else {
        println("WRONG! me need integers")
    }

}

fun task4(){
    var odd= 0
    var even = 0
    println("give me an integer:")
    val input = readlnOrNull()
    if (input != null && input.toIntOrNull() != null) {
        input.forEach {
            if (it.isDigit()) {
                if (it.code % 2 == 0) {
                    even++
                } else {
                    odd++
                }
            }
        }
        println("odd numbers count: $odd, even: $even")
    } else println("dummy i said an integer")

}

fun task5(){
    var output = mutableListOf<Int>()

    for(i in 0..100){
        if (i % 4 == 0){
            output.add(i)
        }
    }

    println("i got ya - this numbers do divide by 4")
    for(x in output){
        print("$x ")
    }
}

fun task6(){
    var sum = 0
    var currentNumber = 5

    while (currentNumber <= 57) {
        if (currentNumber != 34 && currentNumber != 46 && currentNumber != 52) {
            sum += currentNumber
        }
        currentNumber++
    }

    println("sum of nums from 5 to 57, excluding 34, 46 and 52 equals to: $sum")
}
fun main(){
    //task1()
    //task2()
    //task3()
    //task4()
    //task5()
    task6()
}
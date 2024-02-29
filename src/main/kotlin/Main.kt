package org.example

fun lab1n1(){
    println("Lab 1. Number 1.")
    println("Иван" + "\n35" + "\n" + true)
}
fun lab1n2(){

    println("Lab 1. Number 3")
    var five : Int = 5
    var charf : Char = 'F'
    var str : String = "Привет"
    var fl : Float = 90.2F
    val immutable : Int = 67

    println(str)
}
fun lab1n3(){
    println("Lab 1. Number 3")
    val input = readlnOrNull()
    if (input != null && input.length == 4) {
        val number = input.toInt()
        val digit1 = number / 1000
        val digit2 = (number % 1000) / 100
        val digit3 = (number % 100) / 10
        val digit4 = number % 10
        println("$digit1, $digit2, $digit3, $digit4")
    } else {
        println("Error. Enter 4 - digit number!")
    }
}
fun lab1n4(){
    println("Lab 1. Number 4")
    val days : Int = readln().toInt()
    val years = days / 365
    val weeks = (days % 365) / 7
    val remainingDays = (days % 365) % 7

    println("Years: $years, weeks: $weeks, days: $remainingDays")
}
fun lab1n5(){
    println("Lab 1. Number 5")
    val input = readLine()
    if (input != null && input.toIntOrNull() != null) {
        val n = input.toInt()
        val result = n + n * 2
        println("Результат: $result")
    } else {
        println("Error.")
    }
}
fun lab1n6(){
    println("Lab 1. Number 6")
    println("Name:")
    val name = readLine()
    println("Age:")
    val age = readLine()?.toIntOrNull()

    if (name != null && age != null) {
        println("Hi, $name! You are $age years old!")
    } else {
        println("Error.")
    }
}
fun lab2n1(){
    println("Lab 2. Number 1")
    val result = 20 % 17
    if (result > 0) {
        println("Получилось значение большее чем ноль!")
    }
}
fun lab2n2(){
    println("Lab 2. Number 2")
    println("Age:")
    val age = readlnOrNull()?.toIntOrNull()

    if (age != null) {
        when {
            age > 18 -> println("All allowed!")
            age == 18 -> println("You are 18!")
            else -> println("Too young yet.")
        }
    } else {
        println("Error.")
    }
}
fun lab2n3(){
    println("Lab 2. Number 3")
    val number1 = 2
    val number2 = 6
    println("You have numbers: $number1 и $number2")
    println("1. Add")
    println("2. Sub")
    println("0. Nothing")

    val choice = readlnOrNull()?.toIntOrNull()

    when (choice) {
        1 -> {
            val result = number1 + number2
            println("Addition: $result")
        }
        2 -> {
            val result = number1 - number2
            println("Subtract: $result")
        }
        0 -> {
            println("Okay. Nothing")
        }
        else -> {
            println("Error")
        }
    }
}
fun lab2n4(){
    println("Lab 2. Number 4")
    print("Number 1 - 7: ")
    val dayNumber = readlnOrNull()?.toInt()

    when (dayNumber) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Error")
    }
}
fun lab2n5(){
    println("Lab 2. Number 5")
    println("Enter three numbers:")
    val num1 = readlnOrNull()?.toInt()
    val num2 = readlnOrNull()?.toInt()
    val num3 = readlnOrNull()?.toInt()

    if (num1 != null && num2 != null && num3 != null) {
        if (num1 != num2 && num2 != num3 && num1 != num3) {
            val average = (num1 + num2 + num3) / 3.0
            println("Average: $average")
        } else {
            println("Error. Number are equal.")
        }
    } else {
        println("Error.")
    }
}
fun lab2n6(){
    println("Lab 2. Number 6")
    println("Enter number:")
    val balance = readlnOrNull()?.toInt()

    if (balance != null) {
        if (balance > 0) {
            val profit = balance
            println("Profit: $profit")
        } else if (balance < 0) {
            val losses = -balance
            println("Losses: $losses")
        } else {
            println("Losses = earnings")
        }
    } else {
        println("Error.")
    }
}
fun lab2n7(){
    println("Lab 2. Number 7")
    println("First number:")
    val a : Int? = readlnOrNull()?.toInt()
    println("Second number:")
    val b : Int? = readlnOrNull()?.toInt()
    if (a != null && b!= null) {
        if (a % 2 == 0 && b % 2 == 0){
            println(true)
        }
        println(false)
    } else{
        println("Error.")
    }

}

fun main() {
    lab1n1()
    lab1n2()
    lab1n3()
    lab1n4()
    lab1n5()
    lab1n6()

    lab2n1()
    lab2n2()
    lab2n3()
    lab2n4()
    lab2n5()
    lab2n6()
    lab2n7()
}
package lab5

fun Int.years(): String {
    return when {
        this % 10 == 1 && this % 100 != 11 -> "$this год"
        this % 10 in 2..4 && (this % 100 < 10 || this % 100 >= 20) -> "$this года"
        else -> "$this лет"
    }
}

fun main() {
    println(1.years()) // 1 год
    println(2.years()) // 2 года
    println(5.years()) // 5 лет
    println(21.years()) // 21 год
    println(22.years()) // 22 года
    println(23.years()) // 23 года
    println(25.years()) // 25 лет
}
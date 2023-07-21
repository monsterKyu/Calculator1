package com.example.calculator

class Calculator {
    fun add(num1: Double, num2: Double): Double {
        return num1 + num2
    }

    fun subtract(num1: Double, num2: Double): Double {
        return num1 - num2
    }

    fun multiply(num1: Double, num2: Double): Double {
        return num1 * num2
    }

    fun divide(num1: Double, num2: Double): Double? {
        if (num2 == 0.0) {
            println("0으로 나눌 수 없습니다!")
            return null
        }
        return num1 / num2
    }

    fun remainder(num1: Double, num2: Double): Double? {
        if (num2 == 0.0) {
            println("0으로 나눌 수 없습니다!")
            return null
        }
        return num1 % num2
    }
}
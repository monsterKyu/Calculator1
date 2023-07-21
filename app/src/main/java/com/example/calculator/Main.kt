package com.example.calculator

fun main() {
    val calculator = Calculator()

    print("연산자를 입력하세요 (+, -, *, /): ")
    val operator = readLine()

    print("첫 번째 숫자를 입력하세요: ")
    val num1 = readLine()!!.toDouble()

    print("두 번째 숫자를 입력하세요: ")
    val num2 = readLine()!!.toDouble()

    if (num1 != null && num2 != null) {
        val result = when (operator) {
            "+" -> {calculator.add(num1, num2)}
            "-" -> calculator.subtract(num1, num2)
            "*" -> calculator.multiply(num1, num2)
            "/" -> calculator.divide(num1, num2)
            "%" -> calculator.remainder(num1, num2)


            else -> {
                println("실행할수 없습니다")
                return
            }
        }

        if (result != null) {
            println("$num1 $operator $num2 결과: $result")
        } else {
            println("유효한 숫자를 입력해주세요.")
        }

    }
}





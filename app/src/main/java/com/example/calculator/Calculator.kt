package com.example.calculator

fun main() {

    println("숫자를 입력하세요.")
    var num1 = readLine()!!.toInt()
    println("연산자를 고르세요.")
    var oper = readLine()!!.toString()
    println("숫자를 입력하세요.")
    var num2 = readLine()!!.toInt()

    var calc = Calc(num1,oper,num2)
    calc.oper()

}




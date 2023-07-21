package com.example.calculator

class MultiplyOperation(num1: Int, num2: Int) :AbstractOperation() {

    override var num1: Int = num1
    override var num2: Int = num2

    override fun oper() {
        var result = num1 * num2
        println("결과값 : $result")
    }
}
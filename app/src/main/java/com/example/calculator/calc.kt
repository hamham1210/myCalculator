package com.example.calculator

open class Calc(num1: Int,  oper : String,num2: Int): AbstractOperation() {
    override var num1: Int = num1
    override var num2: Int = num2
    private var _oper: String = oper

//클래스의 책임(단일책임원칙)부족

//    var add = AddOperation(num1, num2)
//    var mul = MultiplyOperation(num1, num2)
//    var div = DivideOperation(num1, num2)
//    var sub = SubstractOperation(num1, num2)
//    var mol = ModulOperation(num1, num2)

//    lateinit var op : AbstractOperation

    override fun oper() {
        when (_oper) {
            "+" -> {
                AddOperation(num1,num2).oper()
            }

            "-" -> {
                SubstractOperation(num1, num2).num1=1
            }

            "*" -> {
                 MultiplyOperation(num1,num2)
            }

            "/" -> {
                 DivideOperation(num1,num2)
            }

            "%" -> {
                  ModulOperation(num1,num2)
            }
        }
    }
}


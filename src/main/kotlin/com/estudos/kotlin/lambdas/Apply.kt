package com.estudos.kotlin.lambdas

class Calculadora2{
    var resultado = 0
    fun soma(valor1: Int, valor2: Int) {
        resultado += valor1 + valor2
    }
    fun add(valor: Int){
        resultado += valor
    }

}

fun main(args: Array<String>) {
    val calculadora2 = Calculadora2()
    calculadora2.apply { soma(4,5) }.apply { add(5) }.apply { println(resultado) }
    // ou
    calculadora2.apply {
        soma(4,5)
        add(6)
        println(resultado)
    }
    with(calculadora2){
        soma(4,5)
        add(6)
        println(resultado)
    }
}
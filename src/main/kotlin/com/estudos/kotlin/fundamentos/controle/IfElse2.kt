package com.estudos.kotlin.fundamentos.controle

fun main(args: Array<String>) {
    val num1: Int = 7
    val num2: Int = 22

    val maiorValor = if (num1 > num2) {
        println("processing if...")
        num1
    } else {
        println("processing else...")
        num2
    }
    println("O maior valor é $maiorValor.")

    val maiorValor2 = if (num1 > num2) num1 else num2

    println("O maior valor é $maiorValor2.")
}
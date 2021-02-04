package com.estudos.kotlin.funcoes

fun potencia(base: Int = 2, expoente: Int = 1) = Math.pow(base.toDouble(), expoente.toDouble()).toInt()
fun main(args: Array<String>) {
    println(potencia(2,3))
    println(potencia(2))
    println(potencia(base = 10))
    println(potencia(expoente = 8))
}
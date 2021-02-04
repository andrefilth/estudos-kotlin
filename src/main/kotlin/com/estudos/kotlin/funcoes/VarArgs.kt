package com.estudos.kotlin.funcoes

fun ordenar(vararg numeros: Int) : IntArray = numeros.sortedArray()

fun main(args: Array<String>) {
    for (n in ordenar(38, 3, 456, 8, 1, 88, 73))
        println("$n")
}
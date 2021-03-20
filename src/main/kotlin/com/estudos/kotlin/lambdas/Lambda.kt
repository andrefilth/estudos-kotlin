package com.estudos.kotlin.lambdas

fun main(args: Array<String>) {
    val soma = {x: Int, y: Int -> x + y}
    println(soma(2,3))
}
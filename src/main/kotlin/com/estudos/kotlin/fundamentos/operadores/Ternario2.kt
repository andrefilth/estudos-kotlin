package com.estudos.kotlin.fundamentos.operadores
fun obterResultado(nota: Double):String = if (nota >=7 ) "Aprovado" else "Reprovado"
fun main(args: Array<String>) {
    val nota: Double = 7.2

    println(obterResultado(nota))
}
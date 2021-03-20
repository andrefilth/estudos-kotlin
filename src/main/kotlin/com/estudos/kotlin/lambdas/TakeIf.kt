package com.estudos.kotlin.lambdas

fun main(args: Array<String>) {
    println("Digite a sua mensagem: ")
    val entrada = readLine()
    val mensagem = entrada.takeIf { it?.trim()?.isNotEmpty() ?: false } ?: "Sem mensagem"
    println(mensagem)
}
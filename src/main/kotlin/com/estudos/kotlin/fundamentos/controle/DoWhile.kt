package com.estudos.kotlin.fundamentos.controle

fun main(args: Array<String>) {
    var opcao: Int = 0
    do {
        val line = readLine() ?: 0.toString()
        opcao = line.toIntOrNull() ?: 0
        println("Você escolheu a opção $opcao")
    }while (opcao != -1)
    println("Até a próxima")
}
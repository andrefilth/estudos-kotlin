package com.estudos.kotlin.collections

data class Fruta(var nome: String, var preco: Double)

fun main(args: Array<String>) {
    val banana = Fruta("Banana", 1.50)
    var frutas = arrayListOf(
        banana,
        Fruta("Morango", 3.20),
    )
    frutas.forEach { println("${it.nome} - R$ ${it.preco}") }

    println(frutas.contains(banana))
    println(frutas.distinctBy { it.preco })

}
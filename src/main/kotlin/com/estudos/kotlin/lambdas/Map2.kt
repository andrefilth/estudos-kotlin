package com.estudos.kotlin.lambdas

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
    Produto("Fichário escolar", 21.90),
    Produto("Lapís de cor", 11.90),
    Produto("Borracha Bicolor", 0.70),
    Produto("apontador", 1.80),
)
fun main(args: Array<String>) {
    val totalizador = {total: Double, atual: Double -> total + atual}
    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizador)
    println("O preço médio é R$ ${precoTotal / materialEscolar.size}")
}
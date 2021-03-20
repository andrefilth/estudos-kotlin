package com.estudos.kotlin.classes

class Filme2( val nome: String,
              val anoLancamento: Int,
              val genero: String) {
}
fun main(args: Array<String>) {
    val filme = Filme2("Monstros SA", 2001, "Comédia")
    println("${filme.nome} foi lançado em ${filme.anoLancamento}")
}

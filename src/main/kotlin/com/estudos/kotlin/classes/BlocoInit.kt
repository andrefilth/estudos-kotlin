package com.estudos.kotlin.classes

class Filme3( nome: String,
              anoLancamento: Int,
              genero: String){
    val nome: String
    val anoLancamento: Int
    val genero: String
    init {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main(args: Array<String>) {
    val filme = Filme3("Os incríveis", 2014, "Ação")
    println("${filme.nome} foi lançado em ${filme.anoLancamento}")
}
package com.estudos.kotlin.classes

class Pessoa1(var nome: String)
class Pessoa2(val nome: String)
class Pessoa3(nomeInicial: String){
    val nome: String = nomeInicial
}

fun main(args: Array<String>) {
    val pessoa1 = Pessoa1(nome = "João")
    pessoa1.nome = "Guilherme"
    println("${pessoa1.nome} sabe programar")
    val pessoa2 = Pessoa2(nome = "João")
    val pessoa3 = Pessoa3(nomeInicial = "João")
}
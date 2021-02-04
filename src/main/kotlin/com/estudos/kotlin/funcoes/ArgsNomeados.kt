package com.estudos.kotlin.funcoes

fun relacaoDeTrabalho(chefe: String, funcionario: String) = "$funcionario é subordinado(a) à $chefe"

fun main(args: Array<String>) {
    println(relacaoDeTrabalho("João", "Maria"))
    println(relacaoDeTrabalho(funcionario = "João", chefe = "Maria"))
}
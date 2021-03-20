package com.estudos.kotlin.lambdas

data class Aluno(val nome: String, val nota: Double)

fun main(args: Array<String>) {
    val alunos = arrayListOf(
        Aluno("Pedro", 7.4),
        Aluno("Artur", 8.0),
        Aluno("Rafael", 9.7),
        Aluno("Ricardo", 5.7),
    )
    val aprovados = alunos.filter { it.nota >= 7.0 }.sortedBy { it.nome }
    val aprovados2 = alunos.filter { it.nota >= 7.0 }.sortedBy { it.nota }
    println(aprovados)
    println(aprovados2)
}
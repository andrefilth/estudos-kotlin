package com.estudos.kotlin.fundamentos.controle

fun main(args: Array<String>) {
    val alunos = listOf("André", "Carla", "Marcos")
    for ((indice, aluno) in alunos.withIndex()){
        println("${indice + 1} - $aluno")
    }

}
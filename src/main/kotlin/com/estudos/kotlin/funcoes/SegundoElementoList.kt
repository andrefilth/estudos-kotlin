package com.estudos.kotlin.funcoes

fun <E> List<E>.secoundOrNull():E? = if(this.size >=2) this[1] else null

fun main(args: Array<String>) {
    val listOf = listOf("A", "B", "C")
    println("segundo ${listOf.secoundOrNull()}")
}
package com.estudos.kotlin.collections

fun Any.print() = println(this)

fun main(args: Array<String>) {
    val conjuntos = hashSetOf(3, 'a', "texto", true, 3.14)
    conjuntos.add(3).print()
    conjuntos.add(10).print()
    conjuntos.size.print()
    conjuntos.remove('a').print()
    conjuntos.contains('a').print()
    conjuntos.contains("Texto").print()
}
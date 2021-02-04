package com.estudos.kotlin.fundamentos

fun main(args: Array<String>) {
    var a: Int? = null
    println(a.apply { println(a?.dec()) })
}
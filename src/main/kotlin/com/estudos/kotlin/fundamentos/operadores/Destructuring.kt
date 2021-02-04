package com.estudos.kotlin.fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main(args: Array<String>) {
    val (marca, modelo) = Carro("Ford", "Fusion")
    println("$marca e $modelo")

    val (marido, mulher) = listOf("João", "Maria")
    println("$marido e $mulher")
    val (_,_, terceiroLugar) = listOf("João", "Maria", "Kimi")
    println("$terceiroLugar terminou em terceiro lugar")
}
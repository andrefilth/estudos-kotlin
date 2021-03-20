package com.estudos.kotlin.classes

class Data(var dia: Int, var mes: Int, var ano: Int){
    fun formatar(): String = "$dia/$mes/$ano"
}

fun main(args: Array<String>) {
    var nascimento = Data(dia = 11, mes = 10, ano = 1983)
    println(nascimento.formatar())
    with(nascimento){ println("$dia/$mes/$ano")}
}
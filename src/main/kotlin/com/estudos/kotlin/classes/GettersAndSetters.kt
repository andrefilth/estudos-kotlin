package com.estudos.kotlin.classes

class Cliente2{
    constructor(nome: String){
        this.nome = nome
    }
    var nome:String
        get() = "Meu nome é ${field}"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo"
        }
}

fun main(args: Array<String>) {
    val c1 = Cliente2("")
    println(c1.nome)
    val cliente2 = Cliente2("André")
    println(cliente2.nome)
}
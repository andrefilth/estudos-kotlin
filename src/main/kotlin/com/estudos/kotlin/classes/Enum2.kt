package com.estudos.kotlin.classes

enum class DiaSemana2(val id: Int, val nome: String, val util:Boolean){
    DOMINGO(1, "Domingo", false),
    SEGUNDA(1, "Segunda", true),
    TERCA(1, "Terça", true),
    QUARTA(1, "Quarta", true),
    QUINTA(1, "Quinta", true),
    SEXTA(1, "Sexta", true),
    SABADO(1, "Sábado", false),
}

fun main(args: Array<String>) {
    DiaSemana2.values().forEach {
            dia -> println("${dia.nome} é um dia ${if (dia.util) "util" else "do fim de semana."}")
    }
}

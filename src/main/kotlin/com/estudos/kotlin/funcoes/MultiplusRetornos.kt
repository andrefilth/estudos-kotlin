package com.estudos.kotlin.funcoes

import java.util.Calendar.*


data class Horario(val hora: Int, val minuto: Int, val segundo: Int)

fun agora() : Horario{
    val agora = getInstance()
    with(agora){
        return Horario(get(HOUR), get(MINUTE), get(SECOND))
    }
}
fun main(args: Array<String>) {
    val (hora, minuto, segundo) = agora()
//    println("$h:$m:$s")
}
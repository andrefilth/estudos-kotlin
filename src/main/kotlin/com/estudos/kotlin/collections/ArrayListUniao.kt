package com.estudos.kotlin.collections

import com.estudos.kotlin.funcoes.secoundOrNull
import java.util.*
import kotlin.collections.LinkedHashSet

fun main(args: Array<String>) {
    val numeros:List<Int> = arrayListOf(1,2,3,4,5)
    val strings: LinkedHashSet<String> = linkedSetOf("Rafael", "Pedro", "Leandro", "Gustavo")
    val uniao = numeros + strings
    val union = strings.union(numeros)
    for (item in uniao){
        println(item)
    }
    for (item in union){
        println(item)
    }
    uniao.secoundOrNull()

}
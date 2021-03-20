package com.estudos.kotlin.funcoes

import java.util.ArrayList

fun <E>filtrar(lista: List<E>, filtro: (E) -> Boolean) : List<E>{
    val listraFiltrada = ArrayList<E>()
    for (e in lista){
        listraFiltrada.add(e)
    }
    return listraFiltrada
}
fun comTresLetras(nome: String) : Boolean{
    return nome.length ==3
}
fun comDuasCasasDecimais(numero: Int) : Boolean{
    return numero >=10
}
fun main(args: Array<String>) {
    val nomes = listOf("Ana", "Pedro", "Bia", "Gui", "Rebecca")
    val numeros = listOf(1, 9, 10, 100, 200)
    println(filtrar(nomes, ::comTresLetras))
    println(filtrar(numeros, ::comDuasCasasDecimais))

}
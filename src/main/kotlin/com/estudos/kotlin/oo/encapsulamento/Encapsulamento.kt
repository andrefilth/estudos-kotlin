package com.estudos.kotlin.oo.encapsulamento

private val dentroDoArquivo = 1
internal val dentroDoProjeto = 1
val publico = 1

private fun entroDoArquivo() = 1
internal fun  dentroDoProjeto() = 1
fun publico() = 1

open class Capsula{
    private val dentroDoObjeto = 1
    protected val vaiPorHeranca = 1
    internal val dentroDoProjeto = 1
    val publico = 1

    private fun dentroDoObjeto() = 1
    protected fun vaiPorHeranca() = 1
    internal fun dentroDoProjeto() = 1
    fun publico() = 1
}
class CapsulaFilha : Capsula(){
    fun verificarAcesso(){
        println(vaiPorHeranca)
        println(dentroDoProjeto)
        println(publico)
    }
}
fun verificarAcesso(){
    println(Capsula().dentroDoProjeto)
    println(Capsula().publico)
}

fun main(args: Array<String>) {
    verificarAcesso()
}
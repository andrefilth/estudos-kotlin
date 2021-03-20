package com.estudos.kotlin.funcoes

inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T) : T {
    println("Abrindo transação $nomeFuncao")
    try {
        return funcao()
    }finally {
        println("Método $nomeFuncao executado")
    }
}

fun somar2(a: Int, b: Int): Int = a + a + b
fun main(args: Array<String>) {
    val resultado = executarComLog("somar"){
        somar2(4, 5)
    }
    println(resultado)
}
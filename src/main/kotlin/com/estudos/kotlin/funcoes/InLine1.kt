package com.estudos.kotlin.funcoes

inline fun transacao(a: Int, funcao: () ->Unit){
    println("Abrindo transação $a")
    try {
        funcao()
    }finally {
        println("fechando uma transação $a")
    }
}
fun main(args: Array<String>) {
    transacao(2) {
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
    }
}
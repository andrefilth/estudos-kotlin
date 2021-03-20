package com.estudos.kotlin.lambdas
interface Operacao{
    fun executar(a: Int, b: Int): Int
}
class Multiplicacao: Operacao{
    override fun executar(a: Int, b: Int): Int {
        return a * b
    }
}
class Calculadora{
    fun calcula(a: Int, b: Int) = a + b

    fun calcula(a: Int, b: Int, operacao: Operacao) = a + b

    fun calcula(a: Int, b: Int, operacao: (Int, Int) -> Int): Int = operacao(a, b)
}

fun main(args: Array<String>) {
    val calculadora = Calculadora()
    val resultado1 = calculadora.calcula(3, 4)
    val resultado2 = calculadora.calcula(3, 4, Multiplicacao())
    val subtracao = {a: Int, b: Int -> a - b}
    val resultado3 = calculadora.calcula(3, 4, subtracao)
    println("$resultado1, $resultado2 $resultado3")
}
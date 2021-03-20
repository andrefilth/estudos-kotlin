package com.estudos.kotlin.classes
var desconto : Double = 0.0
class ItemDoPedido(val nome: String, var preco: Double){
    companion object{
        fun create(nome: String, preco: Double) = ItemDoPedido(nome, preco)
//        @JvmStatic var desconto : Double = 0.0
    }
    fun precoComDesconto() = preco - preco * desconto
}

fun main(args: Array<String>) {
    val item1 = ItemDoPedido.create("TV 50 polegadas", 2899.60)
    val item2 = ItemDoPedido("TV 32 polegadas", 1899.60)
    desconto = 0.10
    println(item1.precoComDesconto())
    println(item1.precoComDesconto())
}
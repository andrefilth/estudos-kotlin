package com.estudos.kotlin.collections

fun main(args: Array<String>) {
    var map = HashMap<Long, String>()

    map.put(1, "João")
    map.put(2, "Maria")
    map.put(3, "Pedro")

    map.put(3, "Pedro Filho")

    for (par in map){
        println(par)
    }
    for (par in map.values){
        println(par)
    }
    for (par in map.entries){
        println(par)
    }
}
package com.estudos.kotlin.funcoes

import java.lang.RuntimeException

fun error(t: Throwable, vararg tags: String, msg: () -> String){
    tags.forEach { s: String ->  print("$s") }
}

fun message(string: String) : String {
    return string

}

fun main(args: Array<String>) {


    error(RuntimeException(), "A", "B", "C"){
        message("Aqui")
    }
}

package com.estudos.kotlin.fundamentos

fun main(args: Array<String>) {

    val num1: Byte = 127
    val num2: Short = 32762
    val num3: Int = Int.MAX_VALUE
    val num4: Long = Long.MAX_VALUE

    val num5: Float = 3.14F
    val num6: Double = 3.14

    val char: Char = '?'
    val boolean: Boolean = true
    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))

    println(2 is Int)
    println(10.div(2))
    println(10.dec())


}
package com.estudos.kotlin

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.estudos.kotlin")
		.start()
}


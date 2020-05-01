package com.sandjelkovic.axon.axonkotlinspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AxonKotlinSpringApplication

fun main(args: Array<String>) {
	runApplication<AxonKotlinSpringApplication>(*args)
}

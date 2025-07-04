package com.doe.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DoeBackendApplication

fun main(args: Array<String>) {
	runApplication<DoeBackendApplication>(*args)
}

package de.hamcheese.sandwich

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SandwichApplication

fun main(args: Array<String>) {
	runApplication<SandwichApplication>(*args)
}

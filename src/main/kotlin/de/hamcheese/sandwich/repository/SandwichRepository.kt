package de.hamcheese.sandwich.repository

import de.hamcheese.sandwich.entity.Sandwich
import org.springframework.data.repository.CrudRepository

interface SandwichRepository : CrudRepository<Sandwich, Long> {
    fun findById(id: Int): List<Sandwich>
}
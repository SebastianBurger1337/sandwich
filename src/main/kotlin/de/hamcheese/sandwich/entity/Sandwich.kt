package de.hamcheese.sandwich.entity

import org.springframework.data.annotation.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue

@Entity
class Sandwich (
        @Id
        @GeneratedValue
        val id: Int,
        val ingredients: List<Ingredient>
)
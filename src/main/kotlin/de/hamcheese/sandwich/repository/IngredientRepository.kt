package de.hamcheese.sandwich.repository

import de.hamcheese.sandwich.entity.Ingredient
import org.springframework.data.repository.CrudRepository

interface IngredientRepository : CrudRepository<Ingredient, Long> {

}
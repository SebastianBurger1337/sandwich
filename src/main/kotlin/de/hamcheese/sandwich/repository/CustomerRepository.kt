package de.hamcheese.sandwich.repository

import de.hamcheese.sandwich.entity.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long> {
    fun findByLastName(name: String): List<Customer>
}
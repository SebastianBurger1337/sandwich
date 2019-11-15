package de.hamcheese.sandwich.repository

import de.hamcheese.sandwich.entity.Order
import org.springframework.data.repository.CrudRepository

interface OrderRepository : CrudRepository<Order, Long>{

}
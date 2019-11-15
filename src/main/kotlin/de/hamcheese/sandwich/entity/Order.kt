package de.hamcheese.sandwich.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
public class Order(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var orderId: Int,
        var products: List<Sandwich>,
        var customerId: Int,
        var delivery: Boolean,
        var totalPrice: Int,
        var tax: Int
)
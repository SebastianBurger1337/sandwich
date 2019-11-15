package de.hamcheese.sandwich.entity

import org.springframework.data.annotation.Id
import javax.persistence.Entity
import javax.persistence.GenerationType
import javax.persistence.GeneratedValue



@Entity
class Customer (

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,
    val firstName: String,
    val lastName: String,
    val points : Int


)
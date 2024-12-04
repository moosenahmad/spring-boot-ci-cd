package com.example.demo.model

import jakarta.persistence.*

@Entity
@Table(name = "app_user") // Change the table name
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
    val email: String
)

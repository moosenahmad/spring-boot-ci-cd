package com.example.demo.controller

import com.example.demo.model.User
import com.example.demo.repository.UserRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val userRepository: UserRepository) {

    @GetMapping
    fun getAllUsers(): List<User> = userRepository.findAll()

    @PostMapping
    fun createUser(@RequestBody user: User): User = userRepository.save(user)
}

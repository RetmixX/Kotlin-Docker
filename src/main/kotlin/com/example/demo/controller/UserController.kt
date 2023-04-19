package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class UserController(private val storage: List<String> = listOf("A", "b", "v")) {
    @GetMapping
    fun test():List<String> = storage
    @GetMapping("test")
    fun getTest():String = "Проверка"
}
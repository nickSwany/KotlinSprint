package com.example.kotlinsprint

const val MIN_LENGTH = 4

fun main() {
    println("Придумайте логин:")

    val userLogin = userLoginAndPassword()

    println("Придумайте пароль:")

    val userPassword = userLoginAndPassword()

    if (checkLength(userLogin) && checkLength(userPassword)) println("Добро пожаловать")

    else println("Логин или пароль недостаточно длинные")
}

fun userLoginAndPassword(): String {
    return readln()
}

fun checkLength(userText: String): Boolean {
    val length = userText.length
    return length >= MIN_LENGTH
}
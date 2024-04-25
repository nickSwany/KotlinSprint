package com.example.kotlinsprint

const val MIN_LENGTH = 4

fun main() {
    checkLength()
}

fun userLogin(): String {
    println("Придумайте логин:")
    return readln()

}

fun userPassword(): String {
    println("Придумайте пароль:")
    return readln()

}

fun checkLength() {
    val lengthLogin = userLogin().length
    val lengthPassword = userPassword().length

    if (lengthLogin >= MIN_LENGTH && lengthPassword >= MIN_LENGTH) println("Добро пожаловать")
    else println("Логин или пароль недостаточно длинные")
}
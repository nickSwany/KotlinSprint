package com.example.kotlinsprint.lession6

fun main() {

    println("Необходимо пройти регистрацию\n\nПридумайте логин для входа.")

    val userLogin = readln()

    println("Придумайте пароль")

    val userPassword = readln()

    do {
        println("Введите логин")
        val login = readln()
    } while (login != userLogin)

    do {
        println("Введите пароль")
        val password = readln()
    } while (password != userPassword)

    println("Авторизация прошла успешно")
}
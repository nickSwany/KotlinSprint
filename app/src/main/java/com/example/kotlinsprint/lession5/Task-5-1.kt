package com.example.kotlinsprint.lession5

fun main() {
    val text = "Для входа необходимо решить следующий математический пример\n2+2*2=?"

    println(text)

    val example = 2 + 2 * 2

    val answer = readLine()?.toIntOrNull()
    val result = if (answer == example) "Добпро пожаловать!"
    else "Доступ запрещен!"

    println(result)
}
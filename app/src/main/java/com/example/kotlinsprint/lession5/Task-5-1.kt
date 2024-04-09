package com.example.kotlinsprint.lession5

fun main() {
    val example = "Для входа необходимо решить следующий математический пример\n2+2*2=?"

    println(example)

    val answer = readLine()!!.toInt()
    val result = if (answer == 6) "Добпро пожаловать!"
    else "Доступ запрещен!"

    println(result)
}
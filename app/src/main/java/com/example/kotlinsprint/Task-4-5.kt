package com.example.kotlinsprint

const val MIN_CREW = 55
const val MAX_CREW = 70
const val SUPPLIES_BOX = 50

fun main() {

    println("Имеются ли на корабле повреждения?\nНеобходимо ответить: true/false")
    val shipIntegrity = readLine()!!.toBoolean()

    println("Введите количество людей в экипаже")
    val crew = readLine()!!.toInt()

    println("Введите количество ящиков с провизией")
    val boxOfSupplies = readLine()!!.toInt()

    println("Благоприятная ли погда?\nНеобходимо ответить: true/false")
    val weather = readLine()!!.toBoolean()

    if (!shipIntegrity &&
        (crew in MIN_CREW..MAX_CREW) &&
        (boxOfSupplies > SUPPLIES_BOX) &&
        weather ||
        (crew == MAX_CREW) &&
        (boxOfSupplies > SUPPLIES_BOX))
        println("Отбытие разрешено")
    else println("Отбытие ЗАПРЕЩЕНО!!!")
}
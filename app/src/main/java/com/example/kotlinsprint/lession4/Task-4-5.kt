package com.example.kotlinsprint

const val MIN_CREW = 55
const val MAX_CREW = 70
const val SUPPLIES_BOX = 50

fun main() {

    println("Имеются ли на корабле повреждения?\nНеобходимо ответить: true/false")
    val shipIntegrity = readln().toBooleanStrictOrNull()

    println("Введите количество людей в экипаже")
    val crew = readln().toIntOrNull()

    println("Введите количество ящиков с провизией")
    val boxOfSupplies = readln().toIntOrNull()

    println("Благоприятная ли погда?\nНеобходимо ответить: true/false")
    val weather = readln().toBooleanStrictOrNull()

    if (boxOfSupplies != null && shipIntegrity != null &&
        crew != null && weather != null
    ) {
        if ((!shipIntegrity &&
                    (crew in MIN_CREW..MAX_CREW) &&
                    (boxOfSupplies > SUPPLIES_BOX) &&
                    weather) ||
            ((crew == MAX_CREW) &&
                    (boxOfSupplies > SUPPLIES_BOX))
        )
        /* Не совсем понял по комментарию как лучше будет. Так как я сделал выше или тот вариант
        Который ниже?
        (!shipIntegrity &&
                ((crew in MIN_CREW..MAX_CREW) &&
                (boxOfSupplies > SUPPLIES_BOX)) &&
                weather ||
        ((crew == MAX_CREW) &&
                (boxOfSupplies > SUPPLIES_BOX))
    )
         */
            println("Отбытие разрешено")
        else println("Отбытие ЗАПРЕЩЕНО!!!")
    } else println("Необходимо ввести все данные для запроса на отбытие!")
}
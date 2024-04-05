package com.example.kotlinsprint

fun main() {
    val mainWorker = 50
    val intern = 30
    val wagesMainWorker = 30_000
    val wagesIntern = 20_000

    val expensesForMainWorkers = mainWorker * wagesMainWorker
    val commonExpenses = expensesForMainWorkers + (intern * wagesIntern)
    val averegWages = commonExpenses / (mainWorker + intern)

    println(expensesForMainWorkers)
    println(commonExpenses)
    println(averegWages)
}
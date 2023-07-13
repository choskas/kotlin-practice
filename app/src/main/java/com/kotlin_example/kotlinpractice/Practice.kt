package com.kotlin_example.kotlinpractice

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    print(printNotificationSummary(morningNotification))
    print(printNotificationSummary(eveningNotification))
}

fun printNotificationSummary(numberOfMessages: Int): String {
    if (numberOfMessages >= 100) return "99+"
    return numberOfMessages.toString()
}
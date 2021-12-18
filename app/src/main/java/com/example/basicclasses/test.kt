package com.example.basicclasses

import java.text.SimpleDateFormat
import java.util.*


private val users = mutableListOf<Person>()
val simpleDataFormat = SimpleDateFormat("dd/MM/yyyy")

fun main() {

//    var scanner = Scanner(System.`in`)
//    var userInput = scanner.nextLine()
//
//    var date: Date
//    var simpleDataFormat = SimpleDateFormat("dd/MM/yyyy")
//    date = simpleDataFormat.parse(userInput)
//    println("the date is def $date")te

    var scanner = Scanner(System.`in`)
    var userInput = scanner.nextLine()


    if (userInput != "go") {
        parseInput(userInput)
        userInput
    } else {
        printUsers()
    }


}

data class Person(val firstName: String, val lastName: String, val dob: Date)

fun parseInput(userInput: String) {
    val list = userInput.split(" ")
    val firstName = list[0]
    val lastName = list[1]
    val dob = simpleDataFormat.parse(list[2])

    val person = Person(firstName, lastName, dob)
    users.add(person)
//    main()

}

fun printUsers() {
    users.sortBy { it.dob }

    println(users)
}







package com.example.basicclasses

fun main() {
    MixedSum().sum(listOf(9, 3, "7", "3"))
}


class MixedSum {


    val intList = mutableListOf<Int>()

    /*
    * Assume input will be only of Int or String type
    */
    var mixed = listOf<Any>(11, "2")

    fun sum(mixed: List<Any>): Int {

        for (m in mixed) {
            if (m is String) {
                intList.add(m.toInt())
            } else if (m is Int) {
                intList.add(m)
            }
        }

        var sum = 0
        for (i in intList) {
            sum += i
        }
        return sum
    }
}
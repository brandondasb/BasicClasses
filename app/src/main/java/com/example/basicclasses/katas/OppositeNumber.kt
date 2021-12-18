package com.example.basicclasses.katas

fun main() {


    print("the new number is " + opposite(0))
}

fun opposite(number: Int): Int {
var result = 0

    if (number < 0) {
       result=  Math.abs(number)
    } else if (number > 0) {
       result =  -number
    }

return result
}
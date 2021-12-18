package com.example.basicclasses.katas

//Remove First and Last Character
fun main() {
    val strValue = "test"
    //removeChar(strValue)
    println(removeChar(strValue))
}

fun removeChar(str: String): String {

    // str.chars()
    var result: String = ""
    if (str.isNotEmpty()) {
        result = str.substring(1, str.lastIndex)
    }
    return result

}
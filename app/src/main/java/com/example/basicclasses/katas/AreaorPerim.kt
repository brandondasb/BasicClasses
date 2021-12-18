package com.example.basicclasses.katas;
//work out the area depending on the shape square or rectangle
fun main() {
println(areaOrPerimeter(4, 2))
}

fun areaOrPerimeter(l: Int, w: Int): Int {
    // code away...
    return when (l) {
        w -> l * w
        else -> l * 2 + w * 2
    }
}

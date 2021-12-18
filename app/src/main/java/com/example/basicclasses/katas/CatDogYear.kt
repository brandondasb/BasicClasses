package com.example.basicclasses.katas

/**
 * Return their respective ages now as [humanYears,catYears,dogYears]

NOTES:

humanYears >= 1
humanYears are whole numbers only
Cat Years
15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that
Dog Years
15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that
References

http://www.catster.com/cats-101/calculate-cat-age-in-cat-years
http://www.slate.com/articles/news_and_politics/explainer/2009/05/a_dogs_life.html
If you liked this Kata there is another related one here
 * **/

//both cats and dogs age the same in year 1.
const val animalYear1 = 15

const val dogYear2 = 9
const val dogAdultYear = 5

const val catYear2 = 9
const val catAdultYear = 4


fun main() {
    calculateYears(10)
    val cat = Animal(15, 3, 9, 5)
    val dog = Animal(15, 3, 9, 4)
}

fun calculateYears(years: Int): Array<Int> {
    // Your solution is here
    val cat = catYear(years)
    val dog = dogYear(years)
    return arrayOf(years, cat, dog)
}

fun catYear(years: Int): Int {

    var counter: Int
    var age = 0

    if (years >= 2) {
        counter = years - 2
        age = counter * catAdultYear + animalYear1 + catYear2

    } else if (years == 1) {
        counter = animalYear1
        age += counter
    }
    return age
}

fun dogYear(years: Int): Int {
    var counter: Int
    var age = 0
    if (years >= 2) {
        counter = years - 2
        age = counter * dogAdultYear + animalYear1 + dogYear2
    } else if (years == 1) {
        counter = animalYear1
        age += counter
    }
    return age
}


//refactor
class Animal(val year1: Int = 15, val humanAge: Int, val year2: Int, val adultYear: Int) {


    fun yearCalc(humanAge: Int): Int {
        var counter: Int
        var age = 0
        if (humanAge >= 2) {
            counter = humanAge - 2
            age = counter * adultYear + year1 + year2
        } else if (humanAge == 1) {
            counter = year1
            age += counter
        }
        return age
    }


}


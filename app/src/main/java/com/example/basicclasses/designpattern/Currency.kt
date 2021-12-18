package com.example.basicclasses.designpattern

class Currency {

    interface ICurrency {
        fun symbol(): String
        fun code(): String
    }

    class UnitedStateDollar : ICurrency {
        override fun symbol(): String {
            return "$"
        }

        override fun code(): String {
            return "USD"
        }
    }

    class Sterling : ICurrency {
        override fun symbol(): String {
            return "£"
        }

        override fun code(): String {
            return "UK"
        }

    }

    class Euro : ICurrency {
        override fun symbol(): String {
            return "€"
        }

        override fun code(): String {
            return "EUR"
        }
    }
    enum class Country {
        USA, SPAIN, UK, GREECE
    }

    fun currency(country: Country): ICurrency? {
        when (country) {
            Country.SPAIN, Country.GREECE -> return Euro()
            Country.USA -> return UnitedStateDollar()
            Country.UK -> return Sterling()
            else -> return null
        }

    }
}
    fun main(args: Array<String>) {
val test = Currency()
        println(test.currency(Currency.Country.SPAIN)?.code())
        println(test.currency(Currency.Country.GREECE)?.code())
        println(test.currency(Currency.Country.USA)?.code())
        println(test.currency(Currency.Country.UK)?.code())
    }


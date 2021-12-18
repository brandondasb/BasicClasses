package com.example.basicclasses

import android.util.Log

class Destroyer(name: String) {
    //ship's name
    var name: String = ""
        private set

    //what type of ship, always a destroyer
    val type = "Destroyer"

    //how much it can take before sinking
    private var hullIntergrity = 200

    //ammo left in arsenal
    var ammo = 1


    // no external access whatsoever
    private var shotPower = 60

    //has ship been sunk
    private var sunk = false


    //This code runs as the instance is being initialisied
    init {
        //so we ca use the name parameter
        this.name = "$type $name"
    }

    fun takeDamage(damageTaken: Int) {

        if (!sunk) {

            hullIntergrity -= damageTaken
            Log.i("$name damage taken =", "$damageTaken")
            Log.i("$name hull integrity =", "$hullIntergrity")

            if (hullIntergrity <= 0) {
                Log.d("Destroyer", "$name has been sunk")
                sunk = true
            }
        } else {
            //already sunk
            Log.d("error", "Ship does not exist")
        }
    }

    fun shootShell(): Int {
        //let the calling code know how much damage to do
        return if (ammo > 0) {
            ammo--
            shotPower
        } else {
            0
        }
    }

    fun serviceShip() {

        ammo = 10
        hullIntergrity = 100
    }

}
package com.example.basicclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val friendlyDestroyer = Destroyer("invincible")
        val friendlyCarrier = Carrier("Indomitable")

        val enemyDestroyer = Destroyer("Grey Death")
        val enemyCarrier = Carrier("Big Great Death")

        val friendlyShipYard = ShipYard()

        //uh oh so it begins
        friendlyDestroyer.takeDamage(enemyDestroyer.shootShell())
        friendlyDestroyer.takeDamage(enemyCarrier.launchAerialAttack())

        // clap back
        enemyCarrier.takeDamage(friendlyCarrier.launchAerialAttack())
        enemyCarrier.takeDamage(friendlyDestroyer.shootShell())

        //take stock of the supply situation
        Log.d(
            "${friendlyDestroyer.name} ammo = ",
            "${friendlyDestroyer.ammo}"
        )

        Log.d(
            "${friendlyCarrier.name} attacks = ",
            "${friendlyCarrier.attacksRemaining}"
        )

        //dock at shipyard
        friendlyShipYard.serviceCarrier(friendlyCarrier)
        friendlyShipYard.serviceDestroyer(friendlyDestroyer)
        // take stock of the supplies situation
        Log.d(
            "${friendlyDestroyer.name} ammo = ",
            "${friendlyDestroyer.ammo}"
        )

        Log.d(
            "${friendlyCarrier.name} attacks = ",
            "${friendlyCarrier.attacksRemaining}"
        )

        //finish off the enemy
        enemyDestroyer.takeDamage(friendlyDestroyer.shootShell())
        enemyDestroyer.takeDamage(friendlyCarrier.launchAerialAttack())
        enemyDestroyer.takeDamage(friendlyDestroyer.shootShell())
    }
}

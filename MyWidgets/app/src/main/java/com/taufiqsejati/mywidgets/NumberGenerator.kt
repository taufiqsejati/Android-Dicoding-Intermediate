package com.taufiqsejati.mywidgets

import java.util.*

//import kotlin.random.Random


internal object NumberGenerator {
    fun generate(max: Int): Int {
        val random = Random()
        return random.nextInt(max)
    }
}
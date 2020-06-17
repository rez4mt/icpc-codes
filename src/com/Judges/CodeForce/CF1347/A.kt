package com.Judges.CodeForce.CF1347

fun main(args: Array<String>) {
    var T = readLine()!!.toInt()
    while (T-->0)
    {
        val( a , b ) = readLine()!!.split(' ').map (String::toInt)
        println(a+b)

    }
}
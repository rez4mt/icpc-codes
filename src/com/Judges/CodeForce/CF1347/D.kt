package com.Judges.CodeForce.CF1347

import kotlin.math.ceil

fun main() {
    var T = readLine()!!.toInt()
    while (T-->0)
    {
        var n = readLine()!!.toInt()
        var list = readLine()!!.split(" ").map (String::toInt)
        if( n == 1)
        {
            println("1 ${list[0]} 0")
            continue
        }
        var lsum: Long = 0
        var rsum : Long = 0
        var moves = ceil(n.toDouble()/2).toInt()
        if(n%2==0)
        {
            for (i in 0 until  n/2)
                lsum+= list[i]
            for (i in (n/2) until n)
                rsum+=list[i]
        }else
        {
            for (i in 0 .. n/2)
                lsum+= list[i]
            for (i in (n/2) +1 until n)
                rsum+=list[i]
        }

        println("$moves $lsum $rsum")
    }
}
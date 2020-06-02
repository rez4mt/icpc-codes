package com.Judges.CodeForce.CF1347

import java.lang.Math.*

fun main() {
    var T = readLine()!!.toInt()
    while (T-->0)
    {
        val (a , b) = readLine()!!.split(" ").map(String::toInt)
        val (c , d) = readLine()!!.split(" ").map(String::toInt)
        val max = max(a,b)
        val diff = abs(a-b)
        if(max==max(c,d) && diff == min(c,d))
            println("YES")
        else println("NO")

    }
}
package com.Judges.CodeForce.CF1347

fun main() {
    var T = readLine()!!.toInt()
    while(T-->0)
    {
        var n = readLine()!!
        var list = arrayListOf<Int>()
        for(i in n.length-1 downTo   0)
        {
            if(n[i]!='0')
            {
                list.add(((n[i]-'0') * Math.pow(10.0 , (n.length-i -1).toDouble())).toInt())
            }
        }
        println(list.size)
        for (i in list)
            print("${i} ")
        println()

    }
}
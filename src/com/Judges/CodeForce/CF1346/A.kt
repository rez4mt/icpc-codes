package com.Judges.CodeForce.CF1346

fun main() {
    var n = readLine()!!.toInt()
    while( n -->0)
    {
        var( n , k ) = readLine()!!.split(" ").map (String::toBigInteger)
        var n1  = n / (1.toBigInteger() + k + (k*k) + (k*k*k))
        print("%d %d %d %d\n".format(n1,k*n1 , k*k*n1 ,k*k*k*n1))
    }
}
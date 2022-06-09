package codeasus.projects.utils

//[1]:: Multiples of 3 or 5
//https://projecteuler.net/problem=1
fun multiplesOfThreeAndFive(): Long {
    var sum = 0L
    for (i in 0 until 1000) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i
        }
    }
    return sum
}

fun multiplesOfThreeAndFiveOneShorter(): Int {
    return (0 until 1000).filter{ it % 3 == 0 || it % 5 == 0 }.sum()
}

//[2]:: Even Fibonacci numbers
//https://projecteuler.net/problem=2
fun evenFibonacci(): Int {
    var a = 0
    var b = 0
    var c = 1
    var s = 0

    while (c < 4_000_000) {
        if(c % 2 == 0) {
            s+=c
        }
        a = b
        b = c
        c = b + a
    }

    return s
}

//[3]:: Largest prime factor
//https://projecteuler.net/problem=3
fun largestPrimeFactor(number: Long): Long {
    var value   = number
    var divider = 2L
    while (value != 1L) {
        if(value % divider == 0L) {
            value /= divider
        } else {
            divider++
        }
    }
    return divider
}
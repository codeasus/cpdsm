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

fun multiplesOfThreeAndFiveOneShorter(): Long {
    return (0 until 1000).filter{ it % 3 == 0 || it % 5 == 0 }.sum().toLong()
}

//[2]:: Even Fibonacci Numbers
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

//[3]:: Largest Prime Factor
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

//[4]:: Largest Palindrome Product
//https://projecteuler.net/problem=4
fun largestPalindrome(): Int {
    var m = -1
    for(i in 999 downTo 100) {
        for(j in 999 downTo 100) {
            val t = i * j
            if(isPalindrome(t) && t > m) {
                m = t
            }
        }
    }
    return m
}

fun isPalindrome(number: Int): Boolean {
    var value      = number
    var palindrome = 0
    while(value > 0) {
        val reminder = value % 10
        value       /= 10
        palindrome   = palindrome * 10 + reminder
    }
    return palindrome==number
}
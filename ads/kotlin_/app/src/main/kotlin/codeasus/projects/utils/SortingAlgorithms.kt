@file:Suppress("DuplicatedCode", "unused")

package codeasus.projects.utils

@Suppress("unused")
fun bubbleSort1(numbers: IntArray) {
    for(i in numbers.indices) {
        for(j in 0 until numbers.size - 1) {
            if(numbers[j] > numbers[j + 1]) {
                val temp       = numbers[j + 1]
                numbers[j + 1] = numbers[j]
                numbers[j]     = temp
            }
        }
    }
}

fun bubbleSort2(numbers: IntArray) {
    var sorted = false

    while(!sorted) {
        sorted = true
        for(i in 0 until numbers.size - 1) {
            if(numbers[i] > numbers[i + 1]) {
                val temp       = numbers[i + 1]
                numbers[i + 1] = numbers[i]
                numbers[i]     = temp
                sorted         = false
            }
        }
    }
}

fun bubbleSort3(numbers: IntArray, isSorted: Boolean) {
    var sorted = isSorted
    if(!sorted) {
        sorted = true
        for(i in 0 until numbers.size - 1) {
            if(numbers[i] > numbers[i + 1]) {
                val temp       = numbers[i + 1]
                numbers[i + 1] = numbers[i]
                numbers[i]     = temp
                sorted         = false
            }
        }
    } else {
        return
    }

    bubbleSort3(numbers, sorted)
}
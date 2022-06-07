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
fun selectionSort1(numbers: IntArray) {
    for(i in 0 until numbers.size - 1) {
        for(j in (i + 1) until numbers.size) {
            if(numbers[i] > numbers[j]) {
                val temp   = numbers[i]
                numbers[i] = numbers[j]
                numbers[j] = temp
            }
        }
    }
}
fun selectionSort2(numbers: IntArray) {
    var x: Int
    for(i in 0 until numbers.size - 1) {
        x = i
        for(j in (i + 1) until numbers.size) {
            if(numbers[j] < numbers[x]) {
                x = j
            }
        }
        val temp   = numbers[x]
        numbers[x] = numbers[i]
        numbers[i] = temp
    }
}
fun selectionSort3(numbers: IntArray, baseIndex: Int) {
    var bIndex = baseIndex
    val ind    = numbers.size - baseIndex

    if(baseIndex == 0) {
        return
    }

    for(i in ind + 1 until numbers.size) {
        if(numbers[ind] > numbers[i]) {
            val temp     = numbers[ind]
            numbers[ind] = numbers[i]
            numbers[i]   = temp
        }
    }

    selectionSort3(numbers, --bIndex)
}
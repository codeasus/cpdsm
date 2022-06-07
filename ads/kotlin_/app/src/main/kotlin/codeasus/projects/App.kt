package codeasus.projects

import codeasus.projects.utils.*
import java.util.Arrays


fun main() {
    val numbers: IntArray = intArrayOf(5000, 10, 3, 34, -5, 12, 44, 34, 102, 1034, 596, -2324, 0, 0);
    bubbleSort3(numbers, false)
    print(numbers.contentToString())
}

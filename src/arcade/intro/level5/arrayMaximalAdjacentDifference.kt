package arcade.intro.level5

/**
 * Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.
 *
 * @link https://app.codesignal.com/arcade/intro/level-5/EEJxjQ7oo7C5wAGjE
 */
fun arrayMaximalAdjacentDifference(inputArray: MutableList<Int>): Int {

    var max = -999999999

    for (i in 0 until inputArray.size - 1) {
        max = maxOf(max, kotlin.math.abs(inputArray[i] - inputArray[i + 1]))
    }

    return max
}



fun main() {

    println(arrayMaximalAdjacentDifference(mutableListOf(2, 4, 1, 0)))

}
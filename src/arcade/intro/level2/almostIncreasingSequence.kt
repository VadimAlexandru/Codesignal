package arcade.intro.level2


/**
 * Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.
 *
 * @link https://app.codesignal.com/arcade/intro/level-2/2mxbGwLzvkTCKAJMG
 */
fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {

    var mistakes = 0

    for (i in 0 until sequence.size - 1) {

        if(sequence[i] >= sequence[i + 1]) {
            if (sequence.size > i + 2 &&
                i > 0 &&
                sequence[i - 1] >= sequence[i + 1]) {
                return false
            } else {
                mistakes ++
            }
        }

        if(mistakes > 1) {
            return false
        }

    }
    return true
}

fun main()
{

    println(almostIncreasingSequence(mutableListOf(1, 3, 2))) /* 36/38 tests passed. */

}
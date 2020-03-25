package arcade.intro.level4


/**
 * Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.
 *
 * @link https://app.codesignal.com/arcade/intro/level-4/xYXfzQmnhBvEKJwXP
 */
fun areSimilar(a: MutableList<Int>, b: MutableList<Int>) =
    a.sorted() == b.sorted() && a.zip(b).filter { it.first != it.second }.count() < 3


fun main() {
    println(areSimilar(mutableListOf(1,2,3), mutableListOf(1,2,3))) // true
}
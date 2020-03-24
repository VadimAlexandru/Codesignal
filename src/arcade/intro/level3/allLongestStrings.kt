package arcade.intro.level3

/**
 * Given an array of strings, return another array containing all of its longest strings.
 *
 * @link https://app.codesignal.com/arcade/intro/level-3/fzsCQGYbxaEcTr2bL
 */
fun allLongestStrings(inputArray: MutableList<String>): List<String> =
     inputArray.filter { it.length == inputArray.maxBy { s -> s.length }?.length }

fun main() {

    println(allLongestStrings(mutableListOf("abacaba", "abacab", "abac", "xxxxxx")))

}
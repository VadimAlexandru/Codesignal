package arcade.intro.level3


/**
 * Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
 *
 * @link https://app.codesignal.com/arcade/intro/level-3/3AdBC97QNuhF6RwsQ
 */
fun isLucky(n: Int) : Boolean {
    val num = n.toString()

    return num.subSequence(0, num.length / 2).sumBy { it.toInt() } ==
            num.subSequence(num.length / 2, num.length).sumBy { it.toInt() }
}

fun main() {

    println(isLucky(1212)) // true

}
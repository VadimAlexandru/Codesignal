package arcade.intro.level1


/**
 * Given a year, return the century it is in. The first century spans from the year 1 up to and including the year 100, the second - from the year 101 up to and including the year 200, etc.
 *
 * @link https://app.codesignal.com/arcade/intro/level-1/egbueTZRRL5Mm4TXN
 */
fun centuryFromYear(x: Int): Int = (x - 1) / 100 + 1

fun main() {

    println(centuryFromYear(1905))

}
package arcade.intro.level3

/**
 * Given two strings, find the number of common characters between them.
 *
 * @link https://app.codesignal.com/arcade/intro/level-3/JKKuHJknZNj4YGL32
 */
fun commonCharacterCount(a: String, b: String) =
    ('a' .. 'z').map {
        c -> kotlin.math.min(a.count { it == c }, b.count{ it == c})
    }.sum()

fun main()
{

    println(commonCharacterCount("aabcc", "adcaa")) // 3

}
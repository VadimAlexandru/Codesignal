package arcade.intro.level1

/**
 * Given the string, check if it is a palindrome.
 *
 * @link https://app.codesignal.com/arcade/intro/level-1/s5PbmwxfECC52PWyQ
 */
fun checkPalindrome(s: String) = s.toLowerCase() == s.toLowerCase().reversed()

fun main() {

    println(checkPalindrome("aba"))

}
package arcade.intro.level5


/**
 *
 * @link https://app.codesignal.com/arcade/intro/level-5/veW5xJednTy4qcjso
 */
fun isIPv4Address(s: String) =
    s.split(".").run {
        4 == size && all { it.toIntOrNull() in 0..255 }
    }

fun main() {

    println(isIPv4Address("172.16.254.1"))

}
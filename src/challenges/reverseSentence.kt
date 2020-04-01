package challenges


/**
 *
 * @link https://app.codesignal.com/challenge/XsSLjHmsgGXvKcfmK
 */
fun reverseSentence(sentence: String) = sentence.split(" ").reversed().joinToString(" ")

fun main() {
    println(reverseSentence("Man bites dog"))
}
package challenges

/**
 * @link https://app.codesignal.com/challenge/iqkrZMnxHZ3wjfWFn
 */
fun amendTheSentence(s: String): String {
    var response = ""

    s.mapIndexed { i, c -> response += if(i > 0 && c.isUpperCase()) " ${c.toLowerCase()}" else c.toLowerCase() }

    return response
}


fun main() {

    println(
        amendTheSentence("CodesignalIsAwesome")
    )
}
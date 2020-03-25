package arcade.intro.level3


/**
 * Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!
 *
 * @link https://app.codesignal.com/arcade/intro/level-3/D6qmdBL2NYz49XHwM
 */
fun sortByHeight(a: MutableList<Int>): MutableList<Int> {
    val s = a.filter { it != -1 }.sorted().toMutableList()
    return a.map {
        if (it == -1) -1 else s.removeAt(0)
    }.toMutableList()
}



fun main()
{

    println(sortByHeight(mutableListOf(-1, 150, 190, 170, -1, -1, 160, 180)))

}
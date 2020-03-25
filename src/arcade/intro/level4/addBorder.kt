package arcade.intro.level4


/**
 * Given a rectangular matrix of characters, add a border of asterisks(*) to it.
 *
 * @link https://app.codesignal.com/arcade/intro/level-4/ZCD7NQnED724bJtjN
 */
fun addBorder(picture: MutableList<String>): MutableList<String> {
    val border = "*".repeat(picture[0].length + 2)
    val result = mutableListOf(border)
    picture.map { result.add("*$it*") }
    result.add(border)
    return result
}






fun main()
{

    println(addBorder(mutableListOf("abc","def")))

}
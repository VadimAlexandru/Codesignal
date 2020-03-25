package arcade.intro.level4


/**
 * Several people are standing in a row and need to be divided into two teams. The first person goes into team 1, the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.
 * You are given an array of positive integers - the weights of the people. Return an array of two integers, where the first element is the total weight of team 1, and the second element is the total weight of team 2 after the division is complete.
 *
 * @link https://app.codesignal.com/arcade/intro/level-4/cC5QuL9fqvZjXJsW9
 */
fun alternatingSums(a: MutableList<Int>) =
    mutableListOf(
        a.filterIndexed { i, _ -> i % 2 == 0 }.sum(),
        a.filterIndexed { i, _ -> i % 2 != 0 }.sum()
    )

fun main()
{

    println(alternatingSums(mutableListOf(50, 60, 60, 45, 70))) //[180, 105]

}
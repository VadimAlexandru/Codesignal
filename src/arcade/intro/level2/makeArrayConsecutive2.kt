package arcade.intro.level2


/**
 * Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size. Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1. He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of additional statues needed.
 *
 * @link https://app.codesignal.com/arcade/intro/level-2/bq2XnSr5kbHqpHGJC
 */
fun makeArrayConsecutive2(statues: MutableList<Int>) = statues.max()!! - statues.min()!! - statues.size + 1

fun main() {

    println(makeArrayConsecutive2(mutableListOf(6, 2, 3, 8)))

}
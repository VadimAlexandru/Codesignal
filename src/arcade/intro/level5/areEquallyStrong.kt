package arcade.intro.level5

import kotlin.math.min


/*
function areEquallyStrong($yourLeft, $yourRight, $friendsLeft, $friendsRight) {
    return max($yourLeft,$yourRight) === max($friendsLeft,$friendsRight)
     && min($yourLeft,$yourRight) === min($friendsLeft,$friendsRight);
}

 */

/**
 * Call two arms equally strong if the heaviest weights they each are able to lift are equal.
 * Call two people equally strong if their strongest arms are equally strong (the strongest arm can be both the right and the left), and so are their weakest arms.
 * Given your and your friend's arms' lifting capabilities find out if you two are equally strong.
 *
 * @link https://app.codesignal.com/arcade/intro/level-5/g6dc9KJyxmFjB98dL
 */
fun areEquallyStrong(yourLeft: Int, yourRight: Int, friendsLeft: Int, friendsRight: Int) =
    maxOf(yourLeft, yourRight) == maxOf(friendsLeft, friendsRight) &&
    minOf(yourLeft, yourRight) == minOf(friendsLeft, friendsRight)


fun main() {

    println(areEquallyStrong(10,15,15,10))

}
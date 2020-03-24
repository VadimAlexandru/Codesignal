package arcade.intro.level2


/**
 * Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.
 *
 * @link https://app.codesignal.com/arcade/intro/level-2/yuGuHvcCaFCKk56rJ
 */
fun shapeArea(n: Int): Int {

    if(1 == n) {
        return n
    }

    var d = n * 2 - 1
    var h = d

    while (d > 3) {
        d -= 2
        h += d * 2
    }

    return h + 2
}





fun main()
{

    println(shapeArea(2)) // 5

}
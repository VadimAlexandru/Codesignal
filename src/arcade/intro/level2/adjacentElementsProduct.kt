package arcade.intro.level2

/**
 * Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
 *
 * @link https://app.codesignal.com/arcade/intro/level-2/xzKiBHjhoinnpdh6m
 */
fun adjacentElementsProduct(array: MutableList<Int>): Int {

    if(array.size < 2) {
        return -1
    }

    var max = array[0] * array[1]

   for (i in 1 until array.size - 1) {
       max = maxOf(max, array[i] * array[i + 1])
   }

    return max
}



fun main() {

    println(adjacentElementsProduct(mutableListOf(3, 6, -2, -5, 7, 3)))

}
package arcade.intro.level2

/**
 *
 * @link  https://app.codesignal.com/arcade/intro/level-2/xskq4ZxLyqQMCLshr
 */
fun matrixElementsSum(matrix: MutableList<MutableList<Int>>): Int {

    var s = 0

    for (i in matrix[0].indices)
        for(j in matrix.indices)
            if(matrix[j][i] > 0) s += matrix[j][i]; else break

    return s
}


fun main() {

    println(matrixElementsSum(mutableListOf(
        mutableListOf(0,1,1,2),
        mutableListOf(0,5,0,0),
        mutableListOf(2,0,3,3)
    ))) // 9

}
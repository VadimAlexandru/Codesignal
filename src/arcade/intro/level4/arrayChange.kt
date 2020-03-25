package arcade.intro.level4

/*
function arrayChange($arr) {
    $sum = 0;

    for($i = 0; $i < count($arr) - 1; $i ++)
        if($arr[$i] >= $arr[$i + 1]) {
            $sum += $arr[$i] + 1 - $arr[$i + 1];
            $arr[$i + 1] = $arr[$i] + 1;
        }

    return $sum;
}
 */


/**
 * You are given an array of integers. On each move you are allowed to increase exactly one of its element by one. Find the minimal number of moves required to obtain a strictly increasing sequence from the input.
 *
 * @link https://app.codesignal.com/arcade/intro/level-4/xvkRbxYkdHdHNCKjg
 */
fun arrayChange(inputArray: MutableList<Int>): Int {

    var s = 0

    for (i in 0 until inputArray.size - 1) {
        if (inputArray[i] >= inputArray[i + 1]) {
            s += inputArray[i] + 1 - inputArray[i + 1]
            inputArray[i + 1] = inputArray[i] + 1
        }
    }

    return s
}



fun main() {

    println(arrayChange(mutableListOf(1,1,1))) // 3

}
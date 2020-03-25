package arcade.intro.level4


/*
function palindromeRearranging($str) {
    $a = [];
    $m = 0;
    for($i = 0; $i < strlen($str); $i ++)
        $a[$str[$i]] ++;
    foreach($a as $val)
        if($val % 2 !== 0) $m++;
    return $m < 2;
}
 */

/**
 * Given a string, find out if its characters can be rearranged to form a palindrome.
 *
 * @link https://app.codesignal.com/arcade/intro/level-4/Xfeo7r9SBSpo3Wico
 */
fun palindromeRearranging(inputString: String) =
    inputString.toSet().filter { c -> inputString.count { it == c } % 2 == 1}.count() < 2


fun main() {

    println(palindromeRearranging("aabb"))

}
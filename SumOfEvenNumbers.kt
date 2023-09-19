/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    println(sumOfEvenNumbers(4))
}

fun sumOfEvenNumbers(n: Int): Int {
    var sum = 0
    for (i in 2..n step 2){
        sum = sum + i
    }
    return sum
}

package easy

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    // Write your code here
    var step = 0
    var sum: Int

    for (i in 0 until s.size - m + 1) {
        sum = s.drop(i).take(m).sum()
        if (sum == d) {
            step++
        }
    }

//    or use this
//    for (i in s.indices) {
//        sum = s.drop(i).take(m).sum()
//        if (sum == d) {
//            step++
//        }
//    }

    return step

}

fun main() {
    birthday(s = arrayOf(2, 2, 1, 3, 2), d = 4, m = 2)
}
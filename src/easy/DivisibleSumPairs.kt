package easy

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>):Int {
    // Write your code here
    var step = 0

    for (i in ar.indices){
        for (j in 1 until ar.size){
            if (i < j){
                val sum = ar[i] + ar[j]
                if (sum %k == 0){
                    step++
                }
            }

        }
    }
    return step

}


fun main() {
    println(divisibleSumPairs(ar = arrayOf(1,2,3,4,5,6), n = 6, k = 5))
}
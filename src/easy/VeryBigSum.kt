package easy

fun veryBigSum(ar: Array<Long>): Long {
   var results:Long = 0L
    for(bigNum in ar){
        results += bigNum
    }
    return results
}

fun main() {
    println(veryBigSum(arrayOf(1000000001, 1000000002, 1000000003, 1000000004, 1000000005)))
}
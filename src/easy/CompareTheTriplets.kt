package easy

fun compareTheTriplets(a: Array<Int>, b: Array<Int>):Array<Int> {
    var bob = 0
    var alice = 0
    for (i in a.indices){
        if (a[i] > b[i]){
            alice++
        } else if(a[i] < b[i]){
            bob++
        }
    }
    return arrayOf(alice,bob)

}


fun main() {
    compareTheTriplets(arrayOf(17,28,30), arrayOf(99,16,8))
}
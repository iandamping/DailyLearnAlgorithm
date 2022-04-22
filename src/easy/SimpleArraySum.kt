package easy

fun simpleArraySum(ar: Array<Int>): Int {
  var results = 0
    for(element in ar){
        results += element
    }

    return results

}


fun main() {
    println(simpleArraySum(arrayOf(1,2,3,4,10,11)))
}
package easy

import java.text.DecimalFormat

fun plusMinus(arr: Array<Int>) {
    val decimalFormat = DecimalFormat("#.######")
    var negativeNumber = 0
    var positiveNumber = 0
    var zeroNumber = 0

    for (number in arr){
        when {
            number > 0 -> {
                positiveNumber++
            }
            number < 0 -> {
                negativeNumber++
            }
            else -> zeroNumber++
        }
    }
    println("${decimalFormat.format(positiveNumber.toDouble() / arr.size)}")
    println("${decimalFormat.format(negativeNumber.toDouble() / arr.size)}")
    println("${decimalFormat.format(zeroNumber.toDouble() / arr.size)}")

}

fun main() {
    plusMinus(arrayOf(-4 ,3 ,-9 ,0 ,4 ,1))
}
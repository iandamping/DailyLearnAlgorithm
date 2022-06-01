package easy

import java.util.*


fun sockMerchants(n: Int, ar: Array<Int>):Int {
    // Write your code here
    Arrays.sort(ar)
    var counter = 0
    var pairItem = 0

    while(counter < n-1){
        if (ar[counter] == ar[counter + 1]){
            counter++
            pairItem++
        }
        counter++
    }

    return pairItem
}

fun main() {
//    println(sockMerchants(7, arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20)))
    println(sockMerchants(100, arrayOf(44,55, 11, 15, 4,
        72, 26, 91, 80, 14, 43, 78, 70, 75, 36, 83, 78, 91, 17, 17,
        54, 65, 60, 21, 58, 98, 87, 45, 75, 97, 81, 18, 51, 43, 84, 54, 66, 10, 44,
        45, 23, 38, 22, 44, 65, 9, 78, 42, 100, 94, 58 ,5 ,11, 69, 26,
        20, 19, 64, 64, 93, 60 ,96, 10, 10, 39, 94, 15, 4 ,3 ,10 ,1 ,77, 48, 74,
        20 ,12 ,83, 97 ,5 ,82 ,43 ,15 ,86, 5, 35 ,63, 24 ,53 ,27 ,87 ,45 ,38, 34, 7, 48,
        24 ,100 ,14 ,80 ,54)))
}
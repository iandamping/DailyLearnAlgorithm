package easy

import java.util.*


/*
* Complete the 'migratoryBirds' function below.
*
* The function is expected to return an INTEGER.
* The function accepts INTEGER_ARRAY arr as parameter.
*/

fun migratoryBirds(arr: Array<Int>):Int {
    Arrays.sort(arr)
    val mostFrequentBirds = mutableListOf<Int>()
    var sameNumbers = arr[0]
    var smallestNumbers = 0
    var frequency = 0
    var resetter = 0

    for (i in 1 until arr.size){
        if (arr[i] == arr[i -1]){
            frequency++
        } else{
            if (frequency > resetter){
                resetter = frequency
                sameNumbers = arr[i -1]
                mostFrequentBirds.add(sameNumbers)
            }
            frequency = 0
        }
    }

    if (frequency > resetter){
        sameNumbers = arr[arr.size-1]
        mostFrequentBirds.add(sameNumbers)
    }



    if (mostFrequentBirds.size > 0){
        smallestNumbers = if (mostFrequentBirds.size == 1){
            mostFrequentBirds[0]
        }else {
            mostFrequentBirds[mostFrequentBirds.size -1]
        }

    }

    return smallestNumbers

}

fun main() {
//    print(migratoryBirds(arrayOf(1,4,4,4,5,3)))
    print(migratoryBirds(arrayOf(2 ,4 ,3 ,2 ,3, 1, 2, 1, 3, 3)))
}
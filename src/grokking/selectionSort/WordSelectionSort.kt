package com.junemon.lib

fun main() {
    val data = arrayOf("D","G","H","A","E")
    println("Sebelum disortir: ${data.joinToString(", ")}")

    wordSelectionSort(data)
}

fun wordSelectionSort(data: Array<String>){
    val dataSize = data.size
    for (i in 0 until dataSize - 1){
        var smallestIndex = i
        for (j in (i + 1) until dataSize){
            if (data[j].compareTo(data[smallestIndex]) < 0){
                smallestIndex = j
            }
        }
        val temp = data[i]
        data[i] = data[smallestIndex]
        data[smallestIndex] = temp
    }


    println("Setelah disortir: ${data.joinToString(", ")}")
}
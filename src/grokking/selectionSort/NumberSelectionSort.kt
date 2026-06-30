package com.junemon.lib

fun main() {
    val data = intArrayOf(29, 10, 14, 37, 13)
    println("Sebelum disortir: ${data.joinToString(", ")}")

    selectionSort(data)
}

fun findSmallestIndexData(data: List<Int>): Int {
    var smallestData = data[0]
    var smallestIndex = 0

    for (i in data.indices) {
        if (data[i] < smallestData) {
            smallestData = data[i]
            smallestIndex = i
        }
    }

    return smallestIndex
}

//ugly way
fun uglySelectionSort(data: IntArray) {
    val sisaData = data.toMutableList()
    val newArrayIndex = mutableListOf<Int>()

    while (sisaData.isNotEmpty()) {
        val smallestIndex = findSmallestIndexData(sisaData)

        newArrayIndex.add(sisaData[smallestIndex])

        sisaData.removeAt(smallestIndex)
    }

    println("Setelah disortir (Metode Pop): ${newArrayIndex.joinToString(", ")}")
}

fun selectionSort(data: IntArray) {
    val dataSize = data.size
    for (i in 0 until dataSize - 1) {
        var smallestIndex = i

        for (j in (i + 1) until dataSize)
            if (data[j] < data[smallestIndex]) {
                smallestIndex = j
            }
        //proses swap
        val temp = data[i]
        data[i] = data[smallestIndex]
        data[smallestIndex] = temp
    }
    println("Setelah disortir: ${data.joinToString(", ")}")
}
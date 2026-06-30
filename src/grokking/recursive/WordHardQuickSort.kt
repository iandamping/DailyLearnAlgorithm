fun main() {
    val words = mutableListOf<String>("banana", "apple", "cherry", "astor")
    println(wordMiddleQuickSort(words))
}

fun wordMiddleQuickSort(words: List<String>): List<String>{
    if (words.size <= 1) return words

    var low = 0
    var high = words.size - 1
    var pivotIndex = low + (high - low) / 2
    var pivot = words[pivotIndex]

    //Dijkstra's 3-Way Partitioning
    var less = words.filter { it.compareTo(pivot) < 0 }
    var equal = words.filter { it.compareTo(pivot) == 0 }
    var greater = words.filter { it.compareTo(pivot) > 0 }

    return wordMiddleQuickSort(less) + equal + wordMiddleQuickSort(greater)
}
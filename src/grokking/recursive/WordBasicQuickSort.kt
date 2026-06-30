fun main() {
    val words = mutableListOf<String>("banana", "apple", "cherry", "astor")
    println(wordsQuickSort(words))
}

fun wordsQuickSort(words: List<String>): List<String> {
    if (words.size <= 1) return words
    var pivot = words[0]
    var less = words.drop(1).filter { it.compareTo(pivot) < 0 }
    var greater = words.drop(1).filter { it.compareTo(pivot) >= 0 }

    return wordsQuickSort(less) + pivot + wordsQuickSort(greater)
}
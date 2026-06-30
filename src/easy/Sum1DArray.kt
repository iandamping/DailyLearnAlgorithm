fun main() {
    val num: IntArray = intArrayOf(3, 1, 2, 10, 1)
    for (i in  1 until num.size ) {
        num[i] += num[i - 1] 
    }

    println("Setelah disortir: ${num.joinToString(", ")}")
}
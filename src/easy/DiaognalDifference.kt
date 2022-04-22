package easy

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var nyampingKanan = 0
    var nyampingKiri = 0
    for (i in arr.indices) {
        for (j in arr[0].indices) {
            if (i == j) {
                nyampingKanan += arr[i][j]
            }
            if (i + j == arr.size - 1) {
                nyampingKiri += arr[i][j]
            }
        }
    }

    return if ((nyampingKanan - nyampingKiri) < 0) {
        -(nyampingKanan - nyampingKiri)
    } else (nyampingKanan - nyampingKiri)

}

fun main() {
    val arr = arrayOf(
        arrayOf(11, 2, 4),
        arrayOf(4, 5, 6),
        arrayOf(10, 8, -12)
    )

    println(diagonalDifference(arr))
}
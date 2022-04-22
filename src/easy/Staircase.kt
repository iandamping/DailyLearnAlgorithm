package easy

fun staircase(n: Int) {
    val arrayOfSpace = Array(n) {
        Array(n) { "" }
    }
    for (i in arrayOfSpace.indices) {
        for (j in arrayOfSpace[i].indices) {
            if (i + j == arrayOfSpace[i].size - 1) {
                arrayOfSpace[i][j] = "#"
            } else {
                for (k in 0 .. n-2){
                    if (i + j == arrayOfSpace[i].size + k){
                        arrayOfSpace[i][j] = "#"
                    }
                }
            }
        }

    }
    arrayOfSpace.forEach { arr ->
        arr.forEach {
            print(it)
        }
        println("")

    }
}


fun main() {
    staircase(6)
}
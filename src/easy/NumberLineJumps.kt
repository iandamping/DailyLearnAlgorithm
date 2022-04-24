package easy

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    if (v2 < v1) {
        val remainder = (x1 - x2) % (v2 - v1)
        if (remainder == 0) {
            return "YES"
        }
    }
    return "NO"
}

fun main() {
    kangaroo(0,3,4,2)

}
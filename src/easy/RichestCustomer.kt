import kotlin.math.max

fun main() {
    val rich = arrayOf(arrayOf(7, 1, 3), arrayOf(2, 8, 7), arrayOf(1, 9, 5))
    var maxWealth = 0

    for (i in 0 until rich.size - 1) {
        var currentWealth = 0
        for (j in rich[i].indices) {
            currentWealth += rich[i][j]
        }
        maxWealth = max(maxWealth, currentWealth)
    }

    println("Max wealth: $maxWealth")
}
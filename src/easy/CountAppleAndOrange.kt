fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    //s = starting point of house
    //t = end point of house
    //a = apple tree
    //b = orange tree
    var appleFallenInHouse = 0
    var orangeFallenInHouse = 0

    for (apple in apples.map { it + a }) {
        if (apple in s..t) {
            appleFallenInHouse++
        }
    }

    for (orange in oranges.map { it + b }) {
        if (orange in s..t) {
            orangeFallenInHouse++
        }
    }
    println(appleFallenInHouse)
    println(orangeFallenInHouse)

}

fun main() {
    countApplesAndOranges(7, 10, 4, 12, arrayOf(2, 3, -4), arrayOf(3, -2, -4))
}
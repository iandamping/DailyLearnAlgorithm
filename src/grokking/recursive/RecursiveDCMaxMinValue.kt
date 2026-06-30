import kotlin.math.max

fun main() {

    val unSortedNums = listOf(7, 2, 20, 18, 17, 25, 11, 8, 15)
    println("Max from unSortedNums is ${findMaxValue(unSortedNums)}")

}

fun fact(nums: Int): Int {
    return if (nums == 1) {
        1
    } else nums * fact(nums - 1)
}


fun findMaxValue(nums: List<Int>): Int {
    if (nums.isEmpty()) throw IllegalArgumentException("List cannot be empty")
    if (nums.size == 1) return nums[0]

    val mid = nums.size / 2
    val leftMax = findMaxValue(nums.subList(0, mid))
    val rightMax = findMaxValue(nums.subList(mid, nums.size))

    return maxOf(leftMax, rightMax)
}

fun findMinValue(nums: List<Int>): Int {
    if (nums.isEmpty()) throw IllegalArgumentException("List cannot be empty")
    if (nums.size == 1) return nums[0]

    val mid = nums.size / 2
    val leftMin = findMinValue(nums.subList(0, mid))
    val rightMin = findMinValue(nums.subList(mid, nums.size))

    return minOf(leftMin, rightMin)
}

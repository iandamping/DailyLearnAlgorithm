fun main() {
    val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("The sum is ${sum(nums)}")
}


fun recursiveSum(nums: List<Int>): Int {
    if (nums.isEmpty()) return 0
    if (nums.size == 1) return nums[0]

    val mid = nums.size / 2
    val leftSum = recursiveSum(nums.subList(0, mid))
    val rightSum = recursiveSum(nums.subList(mid, nums.size))

    return leftSum + rightSum
}
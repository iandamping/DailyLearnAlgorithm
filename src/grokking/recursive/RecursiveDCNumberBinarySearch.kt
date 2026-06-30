fun main() {
    val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("BinarySearch is ${recursiveBinarySearch(nums,7,0,nums.size-1)}")
}


fun recursiveBinarySearch(nums: List<Int>, target: Int, low: Int, high: Int): Int {
    if (low > high) return -1

    val mid = low + (high - low) / 2
    return when{
        nums[mid] == target -> mid
        nums[mid] < target -> recursiveBinarySearch(nums, target, mid + 1, high)
        else -> recursiveBinarySearch(nums, target, mid - 1, high)
    }

}
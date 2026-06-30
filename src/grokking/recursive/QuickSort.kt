fun main() {
    val sort = mutableListOf<Int>(10, 5, 2, 3)
    println(quickSort(sort))
}

fun quickSort(nums: List<Int>): List<Int> {
    if (nums.size <= 1) return nums
    var pivot = nums[0]
    var less = nums.drop(1).filter { it < pivot }
    var greater = nums.drop(1).filter { it >= pivot }

    return quickSort(less) + pivot + quickSort(greater)
}
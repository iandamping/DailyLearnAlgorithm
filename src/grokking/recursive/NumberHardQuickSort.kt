fun main() {
    val sort = mutableListOf<Int>(10, 5, 2, 3)
    println(middleQuickSort(sort))
}

fun middleQuickSort(nums: List<Int>): List<Int> {
    if (nums.size <= 1) return nums

    var low = 0
    var high = nums.size - 1
    var pivotIndex = low + (high - low) / 2
    var pivot = nums[pivotIndex]

    //Dijkstra's 3-Way Partitioning
    var less = nums.filter { it < pivot }
    var equal = nums.filter { it == pivot }
    var greater = nums.filter { it > pivot }


    return middleQuickSort(less) + equal + middleQuickSort(greater)
}
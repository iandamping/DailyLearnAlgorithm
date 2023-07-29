class Solution {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        var temp = 0
        val arrayOfNum: MutableSet<Int> = mutableSetOf()
        //for loop from 0 to nums.size -1
        for (i in nums.indices) {
            //for loop from i + 1 to nums.size -1
            for (j in i + 1 until nums.size) {
                temp = nums[i] + nums[j]
                if (temp == target) {
                    arrayOfNum.add(i)
                    arrayOfNum.add(j)
                    break
                }
            }
        }
        if (arrayOfNum.isEmpty()) {
            arrayOfNum.add(0)
            arrayOfNum.add(nums.size - 1)
        }

        return arrayOfNum.toIntArray()
    }
}


fun main() {

    val result = Solution().twoSum(intArrayOf(3,2,4), 6)
    println(result.contentToString())
}

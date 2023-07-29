
class SolutionPalindrome {
    fun isPalindrome(x: Int): Boolean {
        var num = x
        var reversedInteger = 0
        var remainder: Int
        val originalInteger: Int = num


        while (num != 0) {
            remainder = num % 10
            reversedInteger = reversedInteger * 10 + remainder
            num /= 10
        }
        if (reversedInteger < 0){
            reversedInteger = -reversedInteger
        }
        return originalInteger == reversedInteger
    }
}

fun main() {
    val data = SolutionPalindrome().isPalindrome(-121)

    print(data)
}

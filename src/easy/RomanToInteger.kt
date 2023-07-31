class SolutionRomanToInteger {
    fun romanToInt(s: String): Int {
        var result = 0
        var index = 0
        val romanNumber = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )

        while (index < s.length) {
            //this is to check if string is only one char
            if (index == s.length - 1) {
                result += romanNumber[s[index]]!!
                break
            }

            if (romanNumber[s[index]]!! < romanNumber[s[index + 1]]!!) {
                //DO NOT FORGET INDEX + 1 WAS HIGHER THAN INDEX
                result += romanNumber[s[index + 1]]!! - romanNumber[s[index]]!!
                index += 2
            } else {
                result += romanNumber[s[index]]!!
                index++
            }
        }

        return result
    }
}

fun main() {
    val value = SolutionRomanToInteger().romanToInt("IV")
    println(value)

}

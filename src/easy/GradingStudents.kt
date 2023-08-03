class GradingStudent {

    fun gradingStudents(grades: Array<Int>): Array<Int> {
        val result: MutableList<Int> = mutableListOf()
        // Write your code here
        for (element in 0..grades.size - 1) {
            when {
                grades[element] <= 37 -> {
                    result.add(grades[element])
                }

                grades[element] in 38..39 -> {
                    val temp = grades[element] % 5
                    val xxx: Int = if (temp >= 3) {
                        (grades[element] - temp) + 5
                    } else {
                        grades[element]
                    }
                    result.add(xxx)
                }

                grades[element] > 39 -> {
                    val temp = grades[element] % 5
                    val xxx: Int = if (temp > 2) {
                        (grades[element] - temp) + 5
                    } else {
                        grades[element]
                    }
                    result.add(xxx)
                }

            }
        }

        return result.toTypedArray()
    }
}

fun main() {
    GradingStudent().gradingStudents(arrayOf(37,38)).forEach {
        println(it)
    }
}

fun main() {
    val result = numberOfSteps(14)
    println(result)
}

fun numberOfSteps(num: Int): Int {
    var steps = 0
    var results = num
    while (results > 0){
        if (results % 2 == 0){
            results /= 2
        } else {
            results -= 1
        }
        steps++
    }
    return steps


//    var results = num
//    repeat(num){
//        if (results != 0) {
//            steps++
//            if (results % 2 == 0) {
//                results /= 2
//            } else {
//                results -= 1
//            }
//        } else {
//            return steps
//        }
//    }

//    for (i in num downTo 0) {
//        if (results != 0) {
//            steps++
//            if (results % 2 == 0) {
//                results /= 2
//            } else {
//                results -= 1
//            }
//        } else {
//            return steps
//        }
//    }
//    return steps
}


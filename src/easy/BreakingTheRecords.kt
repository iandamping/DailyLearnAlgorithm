package easy

fun breakingRecords(scores: Array<Int>):Array<Int> {

    var lowest = scores[0]
    var highest = scores[0]

    var highestScoreCounter = 0
    var lowestScoreCounter = 0

    for (i in scores.indices){
        if (scores[i] > highest){
            highest = scores[i]
            highestScoreCounter++
        } else if (scores[i] < lowest){
            lowest = scores[i]
            lowestScoreCounter++
        }
    }
    return arrayOf(highestScoreCounter,lowestScoreCounter)
}

fun main() {
    breakingRecords(arrayOf(10, 5, 20, 20, 4, 5, 2, 25, 1))
}

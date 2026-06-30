package com.junemon.lib

fun main() {
    val sortedNames = arrayOf(
        "Aaron", "Abigail", "Adam", "Adrian", "Aidan", "Alexander", "Alexis", "Alice",
        "Amanda", "Amber", "Amy", "Andrew", "Angela", "Anna", "Anthony", "Austin",
        "Ava", "Benjamin", "Blake", "Brandon", "Brayden", "Brenda", "Brian", "Brianna",
        "Brooke", "Bryan", "Cameron", "Carl", "Carlos", "Caroline", "Carter", "Catherine",
        "Charles", "Charlotte", "Chloe", "Christian", "Christopher", "Claire", "Cody", "Cole",
        "Colin", "Connor", "Daniel", "David", "Dennis", "Diana", "Dominic", "Dylan",
        "Edward", "Eleanor", "Eli", "Elijah", "Elizabeth", "Ella", "Emily", "Emma",
        "Ethan", "Evan", "Evelyn", "Gabriel", "Gavin", "Grace", "Gregory", "Hannah",
        "Henry", "Ian", "Isaac", "Isabella", "Isaiah", "Jack", "Jackson", "Jacob",
        "Jacqueline", "James", "Jason", "Jeffrey", "Jeremy", "Jeremiah", "Jesse", "Jessica",
        "John", "Jonathan", "Jordan", "Jose", "Joseph", "Joshua", "Juan", "Julia",
        "Justin", "Kaitlyn", "Kaleb", "Katherine", "Kathleen", "Kayla", "Kevin", "Kyle",
        "Landon", "Lauren", "Liam", "Lily", "Logan", "Lucas", "Luke", "Madison",
        "Marcus", "Margaret", "Maria", "Mark", "Mason", "Matthew", "Megan", "Mia",
        "Michael", "Michelle", "Natalie", "Nathan", "Nicholas", "Noah", "Oliver", "Olivia",
        "Owen", "Patrick", "Peter", "Rachel", "Rebecca", "Richard", "Robert", "Ryan",
        "Samuel", "Sarah", "Sean", "Sebastian", "Sophia", "Stephanie", "Stephen", "Sydney",
        "Thomas", "Timothy", "Tyler", "Valerie", "Victoria", "Vincent", "William", "Zachary"
    )

    val steps = wordBinarySearch(sortedNames,"Isaiah")
    if (steps != -1){
        println("Isaiah found in : $steps steps")
    } else {
        println("Isaiah not found")
    }

}

fun wordBinarySearch(data: Array<String>, userGuess: String): Int {
    var high = data.size - 1
    var low = 0
    var index: Int
    var systemGuess: String
    var steps = 0

    while (low <= high) {
        steps++
        index = low + (high - low) / 2
        systemGuess = data[index]

        if (systemGuess.compareTo(userGuess) < 0) {
            low = index + 1
        } else if (systemGuess.compareTo(userGuess) > 0) {
            high = index - 1
        } else {
            return steps
        }
    }

    return -1
}


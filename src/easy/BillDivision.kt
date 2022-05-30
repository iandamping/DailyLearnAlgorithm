package easy


/*
 * Complete the 'bonAppetit' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY bill
 *  2. INTEGER k
 *  3. INTEGER b
 */

fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    // Write your code here
    var nominal = 0
    for (i in bill){
        nominal += i
    }
    val total = (nominal - bill[k]) / 2

    if (total== b){
        print("Bon Appetit")
    }else print(b - total)
}

fun main() {
    bonAppetit(arrayOf(3,10,2,9), 1, 4)
}

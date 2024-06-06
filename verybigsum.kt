fun aVeryBigSum(ar: Array<Long>): Long {
    // Write your code here
    var sum = 0L
    for (number in ar){
        sum += number
    }
    return sum
}

fun main(args: Array<String>) {
    val arCount = readln().trim().toInt()

    val ar = readln().trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)

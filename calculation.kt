fun main(args: Array<String>) {
    val numArray = doubleArrayOf(5.0, 7.0, 9.0, 11.0, 13.0)
    val SD = calculateSD(numArray)

    System.out.format("Standard Deviation = %.6f", SD)
}

//function

fun calculateSD(numArray: DoubleArray): Double {
    var sum = 0.0
    var standardDeviation = 0.0

    for (num in numArray) {
        sum += num
    }

    val mean = sum / 5

    for (num in numArray) {
        standardDeviation += Math.pow(num - mean, 2.0)
    }

    return Math.sqrt(standardDeviation / 5)
}
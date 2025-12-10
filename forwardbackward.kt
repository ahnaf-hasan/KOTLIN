fun main(args: Array<String>) {

    var first = 2.00f
    var second = 1.00f

    println("--Swap--")
    println("First number = $first")
    println("Second number = $second")

    // Value of first is assigned to temporary
    val temporary = first

    // Value of second is assigned to first
    first = second

    // Value of temporary (which contains the initial value of first) is assigned to second
    second = temporary

    println("--Swap--")
    println("First number = $first")
    println("Second number = $second")
}
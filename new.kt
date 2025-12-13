fun main(args: Array<String>) {
    val n1 = 123
    val n2 = 321
    var lcm: Int

    
    lcm = if (n1 > n2) n1 else n2

    
    while (true) {
        if (lcm % n1 == 0 && lcm % n2 == 0) {
            println("The LCM of $n1 and $n2 is $lcm.")
            break
        }
        ++lcm
    }
}
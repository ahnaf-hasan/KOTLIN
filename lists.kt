import java.util.ArrayList

fun main(args: Array<String>) {

    val list1 = ArrayList<String>()
    list1.add("y")

    val list2 = ArrayList<String>()
    list2.add("z")

    val joined = ArrayList<String>()

    joined.addAll(list1)
    joined.addAll(list2)

    println("list1: $list1")
    println("list2: $list2")
    println("joined: $joined")

}
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {

    val milliseconds: Long = 20000000000

   
    val minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds)

  
    val seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds)

    println("$milliseconds Milliseconds = $minutes minutes")
    println("Or")
    println("$milliseconds Milliseconds = $seconds seconds")
}
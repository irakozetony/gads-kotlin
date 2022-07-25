// functional programming

fun main(args: Array<String>){
    display("I'm alien")
    println(maximum(1, 2))

}
fun display(message: String): Boolean{
    println("You said $message")
    return true
}

fun maximum(a: Int, b: Int): Int = if (a > b) a else b
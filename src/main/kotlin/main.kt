// functional programming

fun main(args: Array<String>){
    display("I'm alien")
    println(maximum(1, 2))
    log(message = "Hello world!", logLevel = 1)

    val text = "With    multiple   \t  whitespace"
    println(replaceMultipleWhiteSpace(text))
//    calling extension functio
    println(text.replaceMultipleWhiteSpaceEx())

}
fun display(message: String): Boolean{
    println("You said $message")
    return true
}

fun maximum(a: Int, b: Int): Int = if (a > b) a else b

fun log(message: String, logLevel: Int = 2){
    println(message + logLevel)
}


// normal function
fun replaceMultipleWhiteSpace(value: String) : String{
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}

// extension function
fun String.replaceMultipleWhiteSpaceEx() : String{
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}
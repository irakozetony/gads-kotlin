// functional programming

fun main(args: Array<String>){
    display("I'm alien")
    println(maximum(1, 2))
    log(message = "Hello world!", logLevel = 1)

    val text = "With    multiple   \t  whitespace"
    println(replaceMultipleWhiteSpace(text))
//    calling extension functio
    println(text.replaceMultipleWhiteSpaceEx())

    val h1 = Header("H1")
    val h2 = Header("H2")
//    normal function
    val h3 = h1.plus(h2)
//    infinix function
    val h4 = h1 + h2

    println(h3.name)
    println(h4.name)

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

class Header(var name: String){}

//we can make a function infix. Don't know how it's different from normal functions though
operator infix fun Header.plus(other: Header):Header{
    return Header(this.name + other.name)
}

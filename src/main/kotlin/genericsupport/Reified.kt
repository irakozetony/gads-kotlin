package genericsupport

fun main(args: Array<String>){
    val names = listOf("Kevin")
    printType(names)
}

fun printType(items: List<Any>){
    val stuff = items as List<String>

    stuff.filter{s -> s == ""}
}
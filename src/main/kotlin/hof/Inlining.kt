package hof

fun main(args: Array<String>) {
    val ints = listOf(1,2,3,4,5)
    val i = first(ints, {i -> i == 3})
    println(i)
}

inline fun <T> first(items: List<T>, predicate: (T) -> Boolean):T{
    for (item in items){
        if (predicate(item)) return item
    }
    throw Exception()
}
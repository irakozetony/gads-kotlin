package hof

val action = {println("Hello, World!")}
val calc = {x: Int, y: Int -> x * y}
val newCalc: (Int, Int) -> Int = {x, y -> x * y}
fun main(args: Array<String>) {
    doSomething(action)
}

fun doSomething(func: () -> Unit){
    func()
}
fun getProduct(func: (a: Int, b: Int) -> Int){

}
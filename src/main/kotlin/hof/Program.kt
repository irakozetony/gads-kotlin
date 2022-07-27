package hof

fun main(args: Array<String>) {
    var program = Program()
    var total = 0
//    program.fibonacci(8, object:hof.Process){
//        override fun execute(value: Int){
//            println(value)
//        }
//    }

//    program.fibonacci(8) {n -> println(n)}
//
//    program.fibonacci(8){ println(it) }
//
//    program.fibonacci(8, ::println)

    program.fibonacci(8, {it -> total += it})
    println(total)

}

interface Process{
    fun execute(value: Int)
}

class Program {
    fun fibonacci(limit: Int, action : (Int) -> Unit){
        var prev = 0
        var current = 0
        var next = 1

        for (i: Int in 1..limit){
            action(next)
            var temp = next
            current = prev
            prev = temp
            next = prev + current

        }
    }
}
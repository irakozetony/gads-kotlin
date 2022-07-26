package types

fun main(args: Array<String>){
    var kevin = DCStudent(1, "Kevin")
    var jones = DCStudent(1, "Kevin")
    println(kevin)

    if (kevin == jones){
        println("Equal")
    }
    else{
        println("Not equal")
    }
}

data class DCStudent(val id: Int, val firstName: String){}
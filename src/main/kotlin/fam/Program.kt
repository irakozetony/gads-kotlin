package fam

fun main() {
    val ints = listOf<Int>(1,2,3,4,5, 30, 13, 45, 1)
//    val smallInts = ints.filter { it < 4 }
//    for (i:Int in smallInts) println(i)

//    val squaredInts = ints.map { it * it }
//    for (i:Int in squaredInts) println(i)

    val smallSquaredInts = ints
        .filter { it < 19 }
        .map { it * it }

    for (i:Int in smallSquaredInts) println(i)

}
package fam

fun main() {
    val ints = listOf<Int>(1,2,3,4,5, 30, 13, 45, 1)
//    val smallInts = ints.filter { it < 4 }
//    for (i:Int in smallInts) println(i)

//    val squaredInts = ints.map { it * it }
//    for (i:Int in squaredInts) println(i)

//    val smallSquaredInts = ints
//        .filter { it < 19 }
//        .map { it * it }
//
//    for (i:Int in smallSquaredInts) println(i)

    val greaterThanSix = {v: Int -> v > 6}

    val meetings = listOf(Meeting(1, "Board meeting"), Meeting(2, "Committee Meeting"))
    val titles = meetings.map{ m -> m.title}
    for (title in titles) println(title)

//    check of all ints are greater than 6
    var largeInts = ints.all{it > 6}
    println(largeInts)

//    checks if any of the ints are greater than 6
    largeInts = ints.any{ it > 6}
    println(largeInts)

//    total items satisfying condition
    var numberOfLargeInts = ints.count{ it > 6}
    println(numberOfLargeInts)

    var intsGreaterThanSix = ints.all(greaterThanSix)
    println(intsGreaterThanSix)

    var found = ints.find(greaterThanSix)
    println(found)



}

class Meeting(val id: Int, val title: String){}
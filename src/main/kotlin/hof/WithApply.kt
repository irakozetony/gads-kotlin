package hof

import java.util.Date

class Meeting{
    var title: String = ""
    var When: Date = Date()
    var who = mutableListOf<String>()

    fun create(){}
}

fun main(args: Array<String>){
    val m = Meeting()
    m.title = "Board meeting"
    m.When = Date(2022, 1, 1)
    m.who.add("Tony")

    with(m){
        title = "Shareholders meeting"
        When = Date(2022, 8, 31)
        who.add("Yves Irakoze")
    }

    m.apply {
        title = "Project Launch"
        When = Date(2022, 10,11)
        who.add("Irakoze Yves")
    }.create()
}
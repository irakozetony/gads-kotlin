package fam



class Meeting2(val id: Int, val title: String){
    val people = listOf(Person2("Sam"), Person2("Alex"))
}

class Person2(val name: String)
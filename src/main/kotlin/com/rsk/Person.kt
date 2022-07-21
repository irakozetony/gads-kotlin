package com.rsk

// notice we have the interface named signatory, but the class name is Person. Contrary to java which would raise errors if we did this, Kotlin allows us to create an interface with a name different from the file names. In java, each class and interface have their own files! First advantage provided by Kotlin
interface Signatory{
    fun sign()
}


// passing attributes in the class definition, exempts us from having to create a constructor, seeing as it is created for us by default.
// val is for values that won't change. like constants. var is for values that may change. for example in main, I could change age, but changing name resulted in an error
// adding the open keyword on class makes it inheritable. normally, Kotlin makes all classes final, which makes it impossible to inherit from them
open class Person(val name:String, var age:Int) : Signatory{
    var isMarried = false

//    the constructor keyword is used to create secondary constructors.
    constructor(name: String, age: Int, isMarried: Boolean): this(name, age){
        this.isMarried = isMarried
    }
//    init runs right after an object is constructed. reminds me of python. Finally, something I recognize. Guess it isn't that hard
//    init {
//        if (name == "Paul" && age < 27) throw Exception("Invalid age")
//    }
    override fun sign() = println("$name aged $age can sign documents and their marital status is $isMarried")

}


// when inheriting from a class, we can't put the types(val or var) of the values as this would override the types from the superclass. (Don't know why it's a bad thing)
class Student(name:String, age:Int) : Person(name, age){}
fun main(args: Array<String>){
    val p = Person("Paul", 21)
    p.sign()
    p.age = 26
    p.sign()
}
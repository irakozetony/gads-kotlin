package com.rsk

// notice we have the interface named signatory, but the class name is Person. Contrary to java which would raise errors if we did this, Kotlin allows us to create an interface with a name different from the file names. In java, each class and interface have their own files! First advantage provided by Kotlin
interface Signatory{
    fun sign()
}


// passing attributes in the class definition, exempts us from having to create a constructor, seeing as it is created for us by default.
// val is for values that won't change. like constants. var is for values that may change. for example in main, I could change age, but changing name resulted in an error
// adding the open keyword on class makes it inheritable. normally, Kotlin makes all classes final, which makes it impossible to inherit from them
open class Person(val name:String, var age:Int, var isMarried:Boolean = false) : Signatory{

    var partnerName : String = ""
//    var isMarried = false

//    the constructor keyword is used to create secondary constructors.
//    However, the preferred approach is to use a feature called default parameters
//    So, rather than having to use a secondary constructor we can attach default parameters to properties
//    then our code changes from below with a secondary constructor, to above in the class definition where we added a third parameter, with a default value
//    constructor(name: String, age: Int, isMarried: Boolean): this(name, age){
//    the "this" keyword calls the secondary constructor through the primary constructor
//        this.isMarried = isMarried
//    }
//    init runs right after an object is constructed. reminds me of python. Finally, something I recognize. Guess it isn't that hard
//    init in kotlin is used to do some more initialization that we couldn't do with the primary constructor. this block is always execute after the constructor
//    init {
//        if (name == "Paul" && age < 27) throw Exception("Invalid age")
//    }
    override fun sign() = println("$name aged $age can sign documents and their marital status is $isMarried")
//   Kotlin has no static keyword. If I remember correctly, a method with the static keyword could be called without a class object. Instead, to achieve the same thing as the static keyword in java, we use companion objects and a JVMstatic annotation
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val a = Person("Arista", 24, false)
            a.sign()
            a.partnerName = "Aristide"
            println("Partner name is ${a.partnerName}")

            a.partnerName = "Tony"
            println("Partner name is ${a.partnerName}")
        }
    }

}


// when inheriting from a class, we can't put the types(val or var) of the values as this would override the types from the superclass. (Don't know why it's a bad thing)
class Student(name:String, age:Int) : Person(name, age){}

//Kotlin provides data classes which are classes used only to hold data
data class User(val name:String, val id: Int)
fun main(args: Array<String>){
    val p = Person("Paul", 21, true)
    p.sign()
    p.age = 26
    p.sign()

    val kevin = User("Kevin", 1)

//    we can also copy one of the values from our data class data
    val otherUser = kevin.copy(id = 2)
//    data classes come with .component() methods to help us in the deconstruction
    val (name, id) = kevin
    println("User is $name and has id of $id")
    print(otherUser)
}
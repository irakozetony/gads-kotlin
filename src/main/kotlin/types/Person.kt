package types


fun main(args: Array<String>){
    val kevin = Student("Kevin", "Jones",1, "Some Tutor")
    println("${kevin.id} ${kevin.firstName} ${kevin.lastName} ${kevin.tutor}")

    val gil = Student.createPostgrad("Gilbert")
    println(gil.firstName)

    val tony = Student.createUndergrad("Tony")
    println(tony.firstName)
}

class Prgoram{
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val kevin = Student("Yves", "Irakoze", 2)
            println("${kevin.id} ${kevin.firstName} ${kevin.lastName}")
        }
    }
}

abstract class Person(var firstName: String, var lastName: String){
    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

open class Student(firstName:String, lastName:String, _id: Int): Person(firstName, lastName){
    val id : Int
    var tutor: String

    init {
        id = _id
        tutor = ""
    }
    constructor(firstName: String, lastName: String, _id: Int, tutor: String): this(firstName, lastName, _id){
        this.tutor = tutor
    }
    fun enrol(courseName: String){
        val course = Courses.allCourses
            .filter { it.title == courseName }
            .firstOrNull()
    }
    override fun getName():String{
        return ""
    }
    override fun getAddress(): String{ return ""}

    companion object : XmlSerializer<Student>{
        override fun toXml(item: Student) {
            TODO("Not yet implemented")
        }
        fun createUndergrad(name: String): Undergraduate{
            return Undergraduate(name)
        }
        fun createPostgrad(name: String): Postgraduate{
            return Postgraduate(name)
        }
    }
}

class Undergraduate(firstName: String) : Student(firstName, "", 1){

}
class Postgraduate(firstName: String): Student(firstName, "", 1){

}

interface XmlSerializer<T>{
    fun toXml(item: T)
}
package types


fun main(args: Array<String>){
    val kevin = Student("Kevin", "Jones",1, "Some Tutor")
    println("${kevin.id} ${kevin.firstName} ${kevin.lastName} ${kevin.tutor}")
}

abstract class Person(var firstName: String, var lastName: String){
    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

class Student(firstName:String, lastName:String, _id: Int): Person(firstName, lastName){
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
}
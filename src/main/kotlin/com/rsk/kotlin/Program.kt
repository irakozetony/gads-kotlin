package com.rsk.kotlin

import com.rsk.java.Person

class Program {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val p = Person()
            p.name = ""
            p.age = 24

            println("${p.name} is ${p.age} years old")

            val partner = p.partner
            println(partner)
        }
    }
}

class Student : Person(){

}
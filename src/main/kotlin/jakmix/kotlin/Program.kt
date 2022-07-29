package jakmix.kotlin

import jakmix.java.Created
import jakmix.java.User

fun main(args: Array<String>){
    var user = User("Kevin")
    var count = 0
    var eventListener = Created( { u:User -> println("User $u has been created: ${++count} times") })
    user.create(eventListener)
    user.create{ println("User $it has been created: ${++count} times") }
}
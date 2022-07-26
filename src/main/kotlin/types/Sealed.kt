package types

sealed class PersonEvent{
    class Awake: PersonEvent()
    class Asleep: PersonEvent()
    class Eating(val food: String): PersonEvent()
}

fun handlePersonEvent(event: PersonEvent){
    when(event){
        is PersonEvent.Asleep -> println("Asleep")
        is PersonEvent.Awake -> println("Awake")
        is PersonEvent.Eating -> println(event.food)
    }
}
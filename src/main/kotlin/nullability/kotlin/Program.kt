package nullability.kotlin

fun main(args: Array<String>){
//    var m:Meeting = Meeting()
    var m:Meeting? = null
    var newMeeting = Meeting()
//    newMeeting = m
    newMeeting = m?: Meeting()
    closeMeeting(newMeeting)
    closeMeeting(m)
}

fun closeMeeting(m: Meeting?): Boolean?{
//    return if (m?.canClose == true) m?.close()
//    else false

    return if (m!!.canClose) m.close()
    else false
}

class Meeting{
    val canClose: Boolean = false

    fun close(): Boolean{
        return true
    }

    fun save(o: Any){
        val saveable = o as? ISaveable
        saveable?.save()
    }
}

interface ISaveable{
    fun save()
}
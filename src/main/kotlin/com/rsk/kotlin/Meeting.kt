package com.rsk.kotlin

class Meeting(val title:String) {
//    if I use val, I won't get a setter, because, remember, val is immutable
    var location = ""

//    allows to access the field in java directly as className.fieldName, without setters or getters
    @JvmField
    var description = ""

    fun addAttendee(attendee:String){
        if (attendee.isNullOrEmpty()) throw MeetingException("Attendee must have a name")
    }
//    will be returned in java as static
    companion object{
        @JvmField
        val APP_VERSION = 1

        @JvmStatic
        fun getAppVersion(): Int{
            return APP_VERSION
        }
    }
}
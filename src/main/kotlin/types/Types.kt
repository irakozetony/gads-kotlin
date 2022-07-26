package types

interface Time{
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0)
    fun setTime(time: TonyTime) = setTime(time.hours)
}

interface EndOfTheWorldTime{
    fun setTime(time: TonyTime)
}

class TonyTime{
    var hours: Int = 0
    var minutes: Int = 0
    var seconds: Int = 0
}

class YetiTime : Time, EndOfTheWorldTime{
    override fun setTime(time: TonyTime){
        super<Time>.setTime(time)
    }
    override fun setTime(hours: Int, mins: Int, secs: Int){}
}
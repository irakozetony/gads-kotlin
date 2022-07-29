package nullability.java;

public class Organizer {
    boolean closeMeeting(MyMeeting meeting){
        if (meeting.canClose) return meeting.close();
        return false;
    }

    public static void main(String[] args){
        Organizer org = new Organizer();
        org.closeMeeting(null);
    }
}

class MyMeeting{
    public boolean canClose;

    public boolean close(){
        return false;
    }
}
package com.rsk.java;

import com.rsk.kotlin.Meeting;

public class Program {
    public static void main(String[] args){
        Meeting board = new Meeting("board meeting");
        board.setLocation("London");
        System.out.println("The meeting is in " + board.getLocation());

        board.description = "A board meeting";
        int version = Meeting.APP_VERSION;

         Meeting.getAppVersion();
    }
}

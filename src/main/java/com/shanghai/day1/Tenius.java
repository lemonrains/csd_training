package com.shanghai.day1;

public class Tenius {

    public static String[] EQUAL_RESULT = new String[]{"LOVE ALL", "FIFTEEN ALL", "THIRTY ALL", "DENUS"};

    public static String[] NORMAL_RESULT = new String[]{"LOVE", "FIFTEEN", "THIRTY", "FORTY"};

    public static String getScore(int server, int reciever) {

        String result = null;
        if(server == reciever) {
            result = EQUAL_RESULT[server > 2 ? 3 : server];
        } else {
            if(server < 4) {
                result = NORMAL_RESULT[server] + " " + NORMAL_RESULT[reciever];
            } else {
                if(server - reciever == 1 ) {
                    result = "SERVER ADVANTAGE";
                } else if(server - reciever > 1) {
                    result = "SERVER WIN";
                }
            }
        }

        return result;
    }



}

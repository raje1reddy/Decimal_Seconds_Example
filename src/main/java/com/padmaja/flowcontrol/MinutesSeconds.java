package com.padmaja.flowcontrol;

public class MinutesSeconds {
    public static String  getDurationString(long minutes, long seconds) {
        if ((minutes < 0)||(seconds <0) ||(seconds>59)) {
            return "invalid value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if(hours < 10){
            hoursString = "0" + hoursString;
        }
        String minuteString = remainingMinutes + "m";
        if(remainingMinutes < 10)
            minuteString = "0" + minuteString;

        String secondString = seconds + "s";
        if(seconds < 10) {
            secondString = "0" + secondString;
        }

        return hoursString + "h" + minuteString + "m" + secondString + "s";
    }


       public static String getDurationString(long seconds) {
           if (seconds < 0) {
               return "Invalid Value";
           }
               long minutes = seconds / 60;
               long remainingSeconds = seconds % 60;

                return  getDurationString(minutes,remainingSeconds);
       }

}



//public class SecondsAndMinutes {
//
//    private static final String INVALID_VALUE_MESSAGE = "Invalid value"; //constants are usually in uppercase, so they are easily identifiable
//    public static String getDurationString(int minutes, int seconds) {
//        if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
//            return INVALID_VALUE_MESSAGE;
//        }
//
//            int hours = (minutes / 60);
//            minutes = minutes % 60;
//
//            String hoursString = hours + "h";
//            if (hours < 10) {hoursString = "0" + hoursString;}
//            String minutesString = minutes + "m";
//            if (minutes < 10) {minutesString = "0" + minutesString;}
//            String secondsString = seconds + "s";
//            if (seconds < 10) {secondsString = "0" + secondsString;}
//            return hoursString + " " + minutesString + " " + secondsString;
//
//    }
//
//    public static String getDurationString(int seconds) {
//        if(seconds < 0) {
//            return INVALID_VALUE_MESSAGE;
//        } else {
//            int minutes = seconds / 60;
//            seconds = seconds % 60;
//            return getDurationString(minutes, seconds);
//        }
//    }
//
//}

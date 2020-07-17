//public class MinutesToYearsAndDaysCalculator {
//
//    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
//
//    public static void printYearsAndDays(long minutes) {
//        if(minutes < 0) {
//            System.out.println(INVALID_VALUE_MESSAGE);
//        }
//
//        long hours = minutes / 60;
//        long days = hours / 24;
//        long finalYears = days / 365;
//        long finalDays = days % 365;
//
//        System.out.println(minutes + " min = " + finalYears + " y and " + finalDays + " d");
//
////        String minutesString = minutes + " min";
////        if(minutes < 10) {minutesString = "0" + minutes + " min";}
////        String daysString = finalDays + " d";
////        if(finalDays < 10) {daysString = "0" + finalDays + " d";}
////        String yearsString = finalYears + " y";
////        if(finalYears < 10) {yearsString = "0" + finalYears + " y";}
////
////        System.out.println(minutesString + " = " + yearsString + " and " + daysString);
//    }
//
//
//}

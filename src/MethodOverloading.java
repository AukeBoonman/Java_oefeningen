//public class MethodOverloading {
//
//    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
//        if(feet < 0 || inches < 0 || inches >= 12) {return -1;}
//        else {
//            double newInches = (feet * 12) + inches;
//            return (double)(newInches * 2.54);
//        }
//    }
//
//    public static double calcFeetAndInchesToCentimeters(double inches) {
//        if(inches < 0) {return -1;}
//        else {
//            double amountOfFeet = (inches / 12);
//            double inchesRemaining = (inches % 12);
//            return calcFeetAndInchesToCentimeters(amountOfFeet, inchesRemaining);
//
//        }
//    }
//
//}

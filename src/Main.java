public class Main {

    //SpeedConverter check
//            public static void main(String[] args) {
//                // psvm --> gives above code
//                long miles = SpeedConverter.toMilesPerHour(10.5);
//                System.out.println("Miles = " + miles);
//
//                SpeedConverter.printConversion(10.5);
//            }

// MegaBytes Converter check
    //    public static void main(String[] args) {
    //        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
    //    }

// Barking Dog check
    //    public static void main(String[] args) {
    //
    //        boolean answer = BarkingDog.shouldWakeUp(false, 7);
    //        System.out.println(answer);
    //    }

// Leap Year Calculator
    //    public static void main(String[] args) {
    //        boolean leapYear = LeapYearCalculator.isLeapYear(2000);
    //        System.out.println(leapYear);
    //    }

// Decimal Comparator
    //    public static void main(String[] args) {
    //        boolean answer = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
    //        System.out.println(answer);
    //    }

// Equal Sum Checker
    //    public static void main(String[] args) {
    //        boolean sum = EqualSumChecker.hasEqualSum(1, -1, 0);
    //        System.out.println(sum);
    //    }

// Teen Number Checker
    //    public static void main(String[] args) {
    //        boolean teen = TeenNumberChecker.hasTeen(23, 32, 42);
    //        System.out.println(teen);
    //
    //        boolean teenNumber = TeenNumberChecker.isTeen(13);
    //        System.out.println(teenNumber);
    //
    //    }

// Method Overloading

    public static void main(String[] args) {

        double centimeters = MethodOverloading.calcFeetAndInchesToCentimeters(3, 7);
        System.out.println(centimeters);
        double newCentimeters = MethodOverloading.calcFeetAndInchesToCentimeters(51);
        System.out.println(newCentimeters);

    }



}
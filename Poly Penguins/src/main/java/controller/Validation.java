package controller;

public final class Validation {

    // Method for validating weight
    public static boolean validateWeightOrSpots(String weight) {

        // Using regex to check if weight is numeric
        if (weight.matches("\\b(\\d+)\\b")) {

            // Once we know it is a valid int, return whether it is greater than 0
            return Integer.parseInt(weight) > 0;

        } else {
            return false;
        }

    }

    // Method for validating blood pressure
    public static boolean validateBloodPressure(String bloodPressure) {

        // Using regex to check if bloodPressure is numeric
        if (bloodPressure.matches("\\b(\\d+\\.\\d+|\\d+)\\b")) {

            // Once we know it is a valid double, return whether it is greater than 0
            return Double.parseDouble(bloodPressure) > 0;

        } else {
            return false;
        }

    }


    // Method for validating gps coordinates
    public static boolean validateGPS(String gps) {

        // Using regex to validate gps including space in middle
        return gps.matches("-?(-?\\b([0-8][0-9]\\.\\d{7}|90\\.0{7}) -?([0-9]{2}\\" +
                ".\\d{7}|1[0-7][0-9]\\.\\d{7}|180\\.0{7})\\b)");

    }



}



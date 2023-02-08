package model;

import controller.ILoggable;

public class Penguin extends Animal implements ILoggable {

    private double bloodPressure;


    // Constructor
    public Penguin(String species, String gender, int weight, double bloodPressure) {
        super(species, gender, weight);
        this.bloodPressure = bloodPressure;
    }

    // Penguin specific toString method
    @Override
    public String toString() {

        String returnString = String.format("""
                                Species: %s
                                Gender: %s
                                Weight: %d
                                Blood Pressure: %f
                                GPS Positions:
                                """,
                                this.getSpecies(),
                                this.getGender(),
                                this.getWeight(),
                                this.bloodPressure
        );

        for (GPS gps: this.getGpsList()) {
            returnString += gps.toString() + "\n";
        }

        returnString += "\n";

        return returnString;
    }

    // =============================================================================================
    // ==============================GETTERS AND SETTERS============================================
    // =============================================================================================

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
}

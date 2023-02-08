package model;


public class SeaLion extends Animal {

    // Sea Lion Properties
    private int numSpots;


    // Constructor
    public SeaLion(String species, String gender, int weight, int numSpots) {
        super(species, gender, weight);
        this.numSpots = numSpots;
    }

    // Sea lion specific toString method
    @Override
    public String toString() {
        String returnString = String.format("""
                                Species: %s
                                Gender: %s
                                Weight: %d
                                Number of spots: %d
                                GPS Positions:
                                """,
                this.getSpecies(),
                this.getGender(),
                this.getWeight(),
                this.numSpots
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

    public int getNumSpots() {
        return numSpots;
    }

    public void setNumSpots(int numSpots) {
        this.numSpots = numSpots;
    }
}

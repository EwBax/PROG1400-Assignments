package model;


public class Walrus extends Animal {

    // Walrus properties
    private String dentalHealth;

    // Constructor
    public Walrus(String species, String gender, int weight, String dentalHealth) {
        super(species, gender, weight);
        this.dentalHealth = dentalHealth;
    }

    // Walrus specific toString method
    @Override
    public String toString() {
        String returnString = String.format("""
                                Species: %s
                                Gender: %s
                                Weight: %d
                                Dental health: %s
                                GPS Positions:
                                """,
                this.getSpecies(),
                this.getGender(),
                this.getWeight(),
                this.dentalHealth
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

    public String getDentalHealth() {
        return dentalHealth;
    }

    public void setDentalHealth(String dentalHealth) {
        this.dentalHealth = dentalHealth;
    }
}

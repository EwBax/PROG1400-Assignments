package model;

import controller.ILoggable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public abstract class Animal implements ILoggable {

    private static final String GPS_LOG_PATH = "out/production/Poly Penguins/gps.txt";

    // Animal properties
    private String species;
    private String gender;
    private int weight;
    private ArrayList<GPS> gpsList;

    // Constructors
    public Animal(String species, String gender, int weight) {
        this.species = species;
        this.gender = gender;
        this.weight = weight;

        this.gpsList = new ArrayList<>();
    }


    // toString method that must be overridden
    @Override
    public abstract String toString();


    // Overriding interface methods
    @Override
    public void writeGPS() {


        //Getting the file path
        Path filePath = Paths.get(GPS_LOG_PATH);
        for (GPS g: gpsList) {
            String stringGPS = g.toString() + "\n";
            byte[] data = stringGPS.getBytes();
            try {
                Files.write(filePath, data, StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void logGPS(GPS gpsEntry) {

        // Adding to this animal's list of entries
        gpsList.add(gpsEntry);

    }



    // =============================================================================================
    // ==================================GETTERS AND SETTERS========================================
    // =============================================================================================


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ArrayList<GPS> getGpsList() {
        return gpsList;
    }
}

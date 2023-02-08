package controller;

import model.*;
import view.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainController {

    private MainFrame           mainFrame;
    private ReportsPanel        reportsPanel;
    private AnimalObservedPanel animalObservedPanel;
    private ReportsController   reportsController;

    private ArrayList<String> runningGPSList;
    private ArrayList<Animal> animalList;

    public MainController() {

        animalObservedPanel = new AnimalObservedPanel();
        reportsPanel = new ReportsPanel();

        mainFrame = new MainFrame(animalObservedPanel, reportsPanel);

        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);

        addAnimalPanelListeners();

        animalObservedPanel.setVisible(true);

        runningGPSList = new ArrayList<>();
        animalList = new ArrayList<>();
    }


    // Method for adding action listeners to animal observed panel
    private void addAnimalPanelListeners() {

        // animal combo listener
        animalComboListener();

        animalButtonListeners();

    }


    // Adds action listener to animal combo box on animal observed panel
    private void animalComboListener() {
        animalObservedPanel.getAnimalCombo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (animalObservedPanel.getAnimalCombo().getSelectedItem().equals("Penguin"))
                {
                    animalObservedPanel.getSpeciesSpecificLabel().setText("Blood Pressure");
                    animalObservedPanel.getDentalHealthCombo().setVisible(false);
                    animalObservedPanel.getSpeciesSpecificField().setVisible(true);

                } else if (animalObservedPanel.getAnimalCombo().getSelectedItem().equals("Sea Lion")) {

                    animalObservedPanel.getSpeciesSpecificLabel().setText("Number of Spots");
                    animalObservedPanel.getDentalHealthCombo().setVisible(false);
                    animalObservedPanel.getSpeciesSpecificField().setVisible(true);

                } else if (animalObservedPanel.getAnimalCombo().getSelectedItem().equals("Walrus")) {

                    animalObservedPanel.getSpeciesSpecificLabel().setText("Dental Health");
                    animalObservedPanel.getDentalHealthCombo().setVisible(true);
                    animalObservedPanel.getSpeciesSpecificField().setVisible(false);

                }

            }
        });
    }


    // Adds action listeners to buttons on animal observed panel
    private void animalButtonListeners() {

        // Add animal entry listener
        animalObservedPanel.getAddEntryButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                addAnimal();

            }
        });

        // Adding gps button listener
        animalObservedPanel.getAddGPSButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                addGPSEntry();

            }
        });

        // View reports listener
        animalObservedPanel.getViewReportsButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                animalObservedPanel.setVisible(false);
                reportsController = new ReportsController(animalObservedPanel, reportsPanel, animalList);
                reportsPanel.setVisible(true);

            }
        });
    }



    // Method to validate entry for adding an animal
    private void addAnimal() {

        // animal species and gender have defaults, so we don't need to validate those

        String gender = animalObservedPanel.getGenderCombo().getSelectedItem().toString();

        String weightString = animalObservedPanel.getWeightField().getText();

        // Checking weight is valid first
        if (!Validation.validateWeightOrSpots(weightString)) {

            // Weight is not valid message
            JOptionPane.showMessageDialog(animalObservedPanel,
                    """
                            Invalid weight.
                            Enter a whole number greater than 0."""
            );

        // Checking if there are any GPS entries
        } else if (runningGPSList.isEmpty()) {

            // Weight is not valid message
            JOptionPane.showMessageDialog(animalObservedPanel,
                    """
                            Enter at least one GPS position."""
            );

        // Checking and validating specific animals
        } else {

            int weight = Integer.parseInt(weightString);

            String animalSpecies = animalObservedPanel.getAnimalCombo().getSelectedItem().toString();

            // Case if user selects penguin
            if (animalSpecies.equals("Penguin")) {

                addPenguin(gender, animalSpecies, weight);

                // Case for if user selected sea lion
            } else if (animalSpecies.equals("Sea Lion")) {

                addSeaLion(gender, animalSpecies, weight);

            } else {

                // Nothing else to validate for walrus, dental health is a combo box with default
                // option
                Walrus walrus = new Walrus(animalSpecies, gender, weight,
                        animalObservedPanel.getDentalHealthCombo().getSelectedItem().toString());

                // logging running gps list
                logGPS(walrus);

                walrus.writeGPS();

                animalList.add(walrus);

                JOptionPane.showMessageDialog(animalObservedPanel,
                        "Walrus saved as new entry.");

            }

        }

    }


    // Method to finish validating and add sea lion
    private void addSeaLion(String gender, String animalSpecies, int weight) {

        String numSpots = animalObservedPanel.getSpeciesSpecificField().getText();

        // Checking if number of spots is valid, then creating sea lion
        if (Validation.validateWeightOrSpots(numSpots)) {

            SeaLion seaLion = new SeaLion(animalSpecies, gender, weight,
                    Integer.parseInt(numSpots));

            // logging running gps list
            logGPS(seaLion);

            seaLion.writeGPS();

            animalList.add(seaLion);

            JOptionPane.showMessageDialog(animalObservedPanel,
                    "Sea lion saved as new entry.");

        } else {

            // Message telling user number of spots is not valid
            JOptionPane.showMessageDialog(animalObservedPanel,
                    """
                            Invalid number of spots.
                            Enter a whole number greater than 0."""
            );

        }
    }


    // Method to finish validating penguin and add one
    private void addPenguin(String gender, String animalSpecies, int weight) {

        String bloodPressure =
                animalObservedPanel.getSpeciesSpecificField().getText();

        // Validating blood pressure, then creating new penguin if valid
        if (Validation.validateBloodPressure(bloodPressure)) {

            Penguin penguin = new Penguin(animalSpecies, gender, weight,
                    Double.parseDouble(bloodPressure));

            // logging running gps list
            logGPS(penguin);

            penguin.writeGPS();

            animalList.add(penguin);

            JOptionPane.showMessageDialog(animalObservedPanel,
                    "Penguin saved as new entry.");

        } else {

            // Message for invalid blood pressure
            JOptionPane.showMessageDialog(animalObservedPanel,
                    """
                            Invalid blood pressure.
                            Please enter a number greater than 0."""
            );

        }

    }

    // Adding a gps entry to running list
    private void addGPSEntry() {

        // Validating gps as string
        String gpsString = animalObservedPanel.getGpsField().getText();

        if (Validation.validateGPS(gpsString)) {

            // Making sure this entry is not a duplicate
            if (runningGPSList.contains(gpsString)) {

                JOptionPane.showMessageDialog(animalObservedPanel,
                        "This GPS entry has already been logged.");

            } else {

                // adding new gps to running list
                runningGPSList.add(gpsString);

                updateGPSArea();

            }


        } else {

            // Message for user that they entered an invalid GPS
            JOptionPane.showMessageDialog(animalObservedPanel, """
                    Invalid GPS format:
                    Latitude values range from -90 to 90.
                    longitude values range from -180 to 180
                    Both values must have 7 digits after the decimal.
                    Separate latitude and longitude values with a space.
                    (-)##.####### (-)(## or ###).#######"""
            );

        }

    }


    // Updating the gps area
    private void updateGPSArea() {

        StringBuilder temp = new StringBuilder();

        for (int i = runningGPSList.size() - 1; i >= 0 ; i--) {

            temp.append(runningGPSList.get(i) + "\n");

        }

        animalObservedPanel.getGpsArea().setText(temp.toString());

    }


    // Method to save running gps list to new animal
    private void logGPS(Animal animal) {

        // Converting each string representation of gps to GPS object and logging to animal
        for (String s: runningGPSList) {

            // Getting latitude and longitude as doubles
            String[] coordinates = s.split(" ");

            double latitude = Double.parseDouble(coordinates[0]);
            double longitude = Double.parseDouble(coordinates[1]);

            GPS gps = new GPS(latitude, longitude);
            gps.writeGPS();

            animal.logGPS(gps);

        }

        // Resetting list and display
        runningGPSList = new ArrayList<>();

        updateGPSArea();

    }








}

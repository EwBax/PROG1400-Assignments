package view;

import javax.swing.*;
import java.awt.*;

public class AnimalObservedPanel extends JPanel {

    private GridBagConstraints gbc;

    // Combo Box String Arrays
    private static final String[] ANIMAL_OPTIONS = {"Penguin", "Sea Lion", "Walrus"};
    private static final String[] GENDER_OPTIONS = {"Male", "Female"};
    private static final String[] DENTAL_HEALTH_OPTIONS = {"Good", "Average", "Poor"};

    // components
    private JLabel      titleLabel;
    private JLabel      animalLabel;
    private JLabel      genderLabel;
    private JLabel      weightLabel;
    private JLabel      speciesSpecificLabel;
    private JLabel      gpsLabel;
    private JComboBox   animalCombo;
    private JComboBox   genderCombo;
    private JComboBox   dentalHealthCombo;
    private JTextField  weightField;
    private JTextField  speciesSpecificField;
    private JTextField  gpsField;
    private JTextArea   gpsArea;
    private JButton     addEntryButton;
    private JButton     addGPSButton;
    private JButton     viewReportsButton;


    // Constructor, initializes and positions all UI elements
    public AnimalObservedPanel() {

        // Configuring panel
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 5, 5);

        // Title Label
        titleLabel = new JLabel("Animal Observed:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(titleLabel, gbc);

        // Animal label
        animalLabel = new JLabel("Animal");
        gbc.insets = new Insets(5, 10, 5, 5);
        gbc.gridy = 1;
        add(animalLabel, gbc);

        // Gender Label
        genderLabel = new JLabel("Gender");
        gbc.gridy = 2;
        add(genderLabel, gbc);

        // Weight label
        weightLabel = new JLabel("Weight in Kg");
        gbc.gridy = 3;
        add(weightLabel, gbc);

        // Species Specific Label
        speciesSpecificLabel = new JLabel("Blood Pressure");
        gbc.gridy = 4;
        add(speciesSpecificLabel, gbc);

        // Add entry Button
        addEntryButton = new JButton("Add Entry");
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(addEntryButton, gbc);

        // Animal Combo
        animalCombo = new JComboBox(ANIMAL_OPTIONS);
        animalCombo.setVisible(true);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(1, 5, 1, 5);
        gbc.anchor = GridBagConstraints.LINE_END;
        add(animalCombo, gbc);

        // Gender Combo
        genderCombo = new JComboBox(GENDER_OPTIONS);
        gbc.gridy = 2;
        add(genderCombo, gbc);

        // Weight Text Field
        weightField = new JTextField();
        gbc.gridy = 3;
        add(weightField, gbc);

        // Species specific stat label
        speciesSpecificField = new JTextField();
        gbc.gridy = 4;
        add(speciesSpecificField, gbc);

        // Combo for dental health for walruses
        dentalHealthCombo = new JComboBox(DENTAL_HEALTH_OPTIONS);
        dentalHealthCombo.setVisible(false);
        add(dentalHealthCombo, gbc);

        // gps label
        gpsLabel = new JLabel("GPS Coordinates: (-)##.####### (-)(## or ###).#######");
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.insets = new Insets(4, 20, 0, 0);
        add(gpsLabel, gbc);

        // gps text field
        gpsField = new JTextField();
        gbc.insets = new Insets(0, 20, 0, 10);
        gbc.gridy = 1;
        add(gpsField, gbc);

        // add gps button
        addGPSButton = new JButton("Add GPS");
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.insets = new Insets(1, 5, 1, 20);
        add(addGPSButton, gbc);

        // gps area
        gpsArea = new JTextArea();
        gpsArea.setEditable(false);
        gpsArea.setDisabledTextColor(Color.BLACK);
        gpsArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        gbc.insets = new Insets(1, 20, 5, 20);
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.gridheight = 5;
        gbc.fill = GridBagConstraints.BOTH;
        add(gpsArea, gbc);


        // View Reports button
        viewReportsButton = new JButton("View Reports");
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.insets = new Insets(20, 0, 20, 20);
        add(viewReportsButton, gbc);
    }

    //==============================================================================================
    //====================================GETTERS AND SETTERS=======================================
    //==============================================================================================

    public GridBagConstraints getGbc() {
        return gbc;
    }

    public void setGbc(GridBagConstraints gbc) {
        this.gbc = gbc;
    }

    public JLabel getTitleLabel() {
        return titleLabel;
    }

    public void setTitleLabel(JLabel titleLabel) {
        this.titleLabel = titleLabel;
    }

    public JLabel getAnimalLabel() {
        return animalLabel;
    }

    public void setAnimalLabel(JLabel animalLabel) {
        this.animalLabel = animalLabel;
    }

    public JLabel getGenderLabel() {
        return genderLabel;
    }

    public void setGenderLabel(JLabel genderLabel) {
        this.genderLabel = genderLabel;
    }

    public JLabel getWeightLabel() {
        return weightLabel;
    }

    public void setWeightLabel(JLabel weightLabel) {
        this.weightLabel = weightLabel;
    }

    public JLabel getSpeciesSpecificLabel() {
        return speciesSpecificLabel;
    }

    public void setSpeciesSpecificLabel(JLabel speciesSpecificLabel) {
        this.speciesSpecificLabel = speciesSpecificLabel;
    }

    public JLabel getGpsLabel() {
        return gpsLabel;
    }

    public void setGpsLabel(JLabel gpsLabel) {
        this.gpsLabel = gpsLabel;
    }

    public JComboBox getAnimalCombo() {
        return animalCombo;
    }

    public void setAnimalCombo(JComboBox animalCombo) {
        this.animalCombo = animalCombo;
    }

    public JComboBox getGenderCombo() {
        return genderCombo;
    }

    public void setGenderCombo(JComboBox genderCombo) {
        this.genderCombo = genderCombo;
    }

    public JComboBox getDentalHealthCombo() {
        return dentalHealthCombo;
    }

    public void setDentalHealthCombo(JComboBox dentalHealthCombo) {
        this.dentalHealthCombo = dentalHealthCombo;
    }

    public JTextField getWeightField() {
        return weightField;
    }

    public void setWeightField(JTextField weightField) {
        this.weightField = weightField;
    }

    public JTextField getSpeciesSpecificField() {
        return speciesSpecificField;
    }

    public void setSpeciesSpecificField(JTextField speciesSpecificField) {
        this.speciesSpecificField = speciesSpecificField;
    }

    public JTextField getGpsField() {
        return gpsField;
    }

    public void setGpsField(JTextField gpsField) {
        this.gpsField = gpsField;
    }

    public JTextArea getGpsArea() {
        return gpsArea;
    }

    public void setGpsArea(JTextArea gpsArea) {
        this.gpsArea = gpsArea;
    }

    public JButton getAddEntryButton() {
        return addEntryButton;
    }

    public void setAddEntryButton(JButton addEntryButton) {
        this.addEntryButton = addEntryButton;
    }

    public JButton getAddGPSButton() {
        return addGPSButton;
    }

    public void setAddGPSButton(JButton addGPSButton) {
        this.addGPSButton = addGPSButton;
    }

    public JButton getViewReportsButton() {
        return viewReportsButton;
    }

    public void setViewReportsButton(JButton viewReportsButton) {
        this.viewReportsButton = viewReportsButton;
    }
}

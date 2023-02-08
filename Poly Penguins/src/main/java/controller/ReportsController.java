package controller;

import view.AnimalObservedPanel;
import view.ReportsPanel;
import model.Animal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReportsController {

    private static final String GPS_LOG_PATH = "out/production/Poly Penguins/gps.txt";

    private AnimalObservedPanel animalObservedPanel;
    private ReportsPanel reportsPanel;
    private ArrayList<Animal> animalList;


    public ReportsController(AnimalObservedPanel animalObservedPanel, ReportsPanel reportsPanel,
                             ArrayList<Animal> animalList) {
        this.animalObservedPanel = animalObservedPanel;
        this.reportsPanel = reportsPanel;
        this.animalList = animalList;

        addReportButtonListeners();
    }


    private void addReportButtonListeners() {

        //show new entries button
        reportsPanel.getNewEntriesButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                showEntriesReport();

            }
        });

        // show gps logs button
        reportsPanel.getGpsLogsButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                showGPSReport();

            }
        });


        // Back button
        reportsPanel.getBackButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                reportsPanel.setVisible(false);
                animalObservedPanel.setVisible(true);

            }
        });

    }


    // Method to generate and display animal entries report
    private void showEntriesReport() {

        StringBuilder report = new StringBuilder();

        for (Animal animal: animalList) {

            report.append(animal.toString());

            report.append("==========================\n");

        }

        reportsPanel.getReportArea().setText(report.toString());

    }


    // Method to generate and display GPS report
    private void showGPSReport() {

        // Getting the path to the file
        Path filePath = Paths.get(GPS_LOG_PATH);

        try {
            // Trying to read the file and set the report to the gps logs
            String textFileAsString = new String(Files.readAllBytes(filePath));
            reportsPanel.getReportArea().setText(textFileAsString);
        } catch (IOException e) {
            e.printStackTrace();
            reportsPanel.getReportArea().setText("There was an error reading from the GPS log " +
                    "file.");
        }


    }
}

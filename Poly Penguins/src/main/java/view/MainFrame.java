package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private AnimalObservedPanel animalObservedPanel;
    private ReportsPanel reportsPanel;


    public MainFrame(AnimalObservedPanel animalObservedPanel, ReportsPanel reportsPanel) {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Antarctic Animal Tracking");
        this.setLayout(new CardLayout());

        this.animalObservedPanel = animalObservedPanel;
        add(this.animalObservedPanel);

        this.reportsPanel = reportsPanel;
        add(this.reportsPanel);
        reportsPanel.setVisible(false);


        this.pack();
    }



    //==============================================================================================
    //====================================GETTERS AND SETTERS=======================================
    //==============================================================================================

    public AnimalObservedPanel getAnimalObservedPanel() {
        return animalObservedPanel;
    }

    public void setAnimalObservedPanel(AnimalObservedPanel animalObservedPanel) {
        this.animalObservedPanel = animalObservedPanel;
    }

    public ReportsPanel getReportsPanel() {
        return reportsPanel;
    }

    public void setReportsPanel(ReportsPanel reportsPanel) {
        this.reportsPanel = reportsPanel;
    }
}
